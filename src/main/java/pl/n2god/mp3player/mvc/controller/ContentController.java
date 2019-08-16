package pl.n2god.mp3player.mvc.controller;

/**
 * @author n2god on 08/08/2019
 * @project mp3player
 */

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ContentController {

    private static final String TITLE_COLUMN = "Tytuł";
    private static final String AUTHOR_COLUMN = "Autor";
    private static final String ALBUM_COLUMN = "Album";

    @FXML
    private TableView<?> contentTable;

    public TableView<?> getContentTable() {
        return contentTable;
    }

    public void initialize(){
        configureTableColumns();
    }

    private void configureTableColumns() {

    }
}

