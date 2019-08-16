package pl.n2god.mp3player.mvc.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
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
}

