/**
 * @project mp3player
 * @author n2god on 03/08/2019
 */module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;
    requires jdk.jfr;

    exports pl.n2god.mp3player.mvc.main to javafx.graphics;
    opens pl.n2god.mp3player.mvc.controller to javafx.fxml;
    opens pl.n2god.mp3player.mvc.mp3 to javafx.base;
}