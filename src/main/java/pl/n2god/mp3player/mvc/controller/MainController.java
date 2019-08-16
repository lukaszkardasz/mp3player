package pl.n2god.mp3player.mvc.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import pl.n2god.mp3player.mvc.mp3.Mp3Song;
import pl.n2god.mp3player.mvc.player.Mp3Player;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

public class MainController{

    @FXML
    private ContentController contentController;

    @FXML
    private ControlController controlController;

    @FXML
    private MenuController menuController;

    private Mp3Player player;

    public void initialize(){

        createPlayer();
    }

    private void createPlayer() {
        ObservableList<Mp3Song> items = contentController.getContentTable().getItems();
         player = new Mp3Player(items);
    }

    //podwójne kliknięcie na wiersz tabeli - przekazujemy nr wiersza i tworzymy modele Media i playera
    private void configureTableClick(){
        TableView<Mp3Song> contentTable = contentController.getContentTable();
        contentTable.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->{
            if (event.getClickCount() == 2){
                int selectedIndex = contentTable.getSelectionModel().getSelectedIndex();
                playSelectedSong(selectedIndex);
            }
        });
    }

    private void playSelectedSong(int selectedIndex) {
        player.loadSong(selectedIndex);
        configureProgressBar();
        configureVolume();
        controlController.getPlayButton().setSelected(true);
    }

    private void configureProgressBar() {
        Slider progressSlider = controlController.getProgressSlider();
        //suwak długości postępu - ustawianie max długości na podstawie długości piosenki
        player.getMediaPlayer().setOnReady(() -> progressSlider.setMax(player.getLoadedSongLength()));
        //zmiana aktualnego czasu piosenki będzie aktualizowała suwak postępu
        player.getMediaPlayer().currentTimeProperty().addListener(
                (argument, oldValue, newValue) -> {
                    progressSlider.setValue(newValue.toSeconds());
                });
        //przesunięcie suwaka powodujące przesunięcie piosenki we wskazane miejsce
        progressSlider.valueProperty().addListener(((observableValue, oldValue, newValue) -> {
            if(progressSlider.isValueChanging()){
                player.getMediaPlayer().seek(Duration.seconds(newValue.doubleValue()));
            }
        }));
    }

    private void configureVolume() {
        Slider volumeSlider = controlController.getVolumeSlider();
        volumeSlider.valueProperty().unbind();
        volumeSlider.setMax(1.0);
        volumeSlider.valueProperty().bindBidirectional(player.getMediaPlayer().volumeProperty()); //podwójne bindowanie volume z playerem
    }

    private void configureButtons(){
        TableView<Mp3Song> contentTable = contentController.getContentTable();
        ToggleButton playButton = controlController.getPlayButton();
        Button nextButton = controlController.getNextButton();
        Button previousButton = controlController.getPreviousButton();

        playButton.setOnAction(actionEvent -> {
            if(playButton.isSelected()){
                player.play();
            } else {
                player.stop();
            }
        });

        nextButton.setOnAction(actionEvent -> {
            contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() + 1);
            playSelectedSong(contentTable.getSelectionModel().getSelectedIndex());
        });

        previousButton.setOnAction(actionEvent -> {
            contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex()-1);
            playSelectedSong(contentTable.getSelectionModel().getSelectedIndex());
        });
    }




}

