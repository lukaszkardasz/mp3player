package pl.n2god.mp3player.main_mp3_player;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author n2god on 03/08/2019
 * @project mp3player
 */
public class MainMp3Player extends Application {
    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/helloView.fxml"));
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }

    public MainMp3Player() {
        System.out.println("constructor");
    }

    @Override
    public void init() {
        System.out.println("init");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
