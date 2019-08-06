package pl.n2god.mp3player.mvc.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button prevousButton;

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
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable; //? bo klasa generyczna i można dać cokolwiek

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("MainController created");
    }
}
