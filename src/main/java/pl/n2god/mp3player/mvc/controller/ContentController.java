package pl.n2god.mp3player.mvc.controller;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ContentController {

    @FXML
    private TableView<?> contentTable;

    public void initialize(){
        System.out.println("Content controller created");
    }
}

