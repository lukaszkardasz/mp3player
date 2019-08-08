package pl.n2god.mp3player.main_mp3_player.controller;

import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

public class MainController{

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

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem exitMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    public void initialize() {
        configureButtons();
        configureSliders();
    }

    private void configureSliders() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("Wciśnięto przycisk na suwaku głośności"));
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
    }
}

