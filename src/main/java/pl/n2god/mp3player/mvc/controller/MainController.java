package pl.n2god.mp3player.mvc.controller;

import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

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

    public void initialize(){

        System.out.println("Main controller created");
        System.out.println(contentController);
        System.out.println(controlController);
        System.out.println(menuController);
    }
}

