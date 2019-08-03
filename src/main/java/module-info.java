/**
 * @project mp3player
 * @author n2god on 03/08/2019
 */module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports pl.n2god.mp3player.main_mp3_player to javafx.graphics, javafx.fxml;
}