package pl.n2god.mp3player.mvc.controller;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class ControlController {

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    public Button getPreviousButton() {
        return previousButton;
    }

    public ToggleButton getPlayButton() {
        return playButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    public Slider getProgressSlider() {
        return progressSlider;
    }

    /*
    prevous version - to teach purpose only

    public void initialize(){
        configureButtons();
        configureSliders();
    }


    private void configureSliders() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("Wciśnięto przycisk na suwaku głośności"));
        volumeSlider.valueProperty().addListener(((observableValue, oldValue, newValue) ->
                System.out.println("Zmiana głośności: " + newValue)
        ));
        progressSlider.valueProperty().addListener(x -> System.out.println("Przesunięcie piosenki!"));
    }

    private void configureButtons() {
        previousButton.setOnAction(event -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x -> System.out.println("Następna piosenka"));
        playButton.setOnAction(event -> {
            if(playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }*/
}

