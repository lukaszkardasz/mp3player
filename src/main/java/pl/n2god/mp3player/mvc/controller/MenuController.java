package pl.n2god.mp3player.mvc.controller;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem exitMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    public MenuItem getFileMenuItem() {
        return fileMenuItem;
    }

    public MenuItem getDirMenuItem() {
        return dirMenuItem;
    }

    public MenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    public MenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }

}

