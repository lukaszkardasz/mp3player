/**
 * @project mp3player
 * @author n2god on 03/08/2019
 */module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports pl.n2god.mp3player.mvc.main to javafx.graphics, javafx.controls;
    opens pl.n2god.mp3player.mvc.controller to javafx.fxml;
}