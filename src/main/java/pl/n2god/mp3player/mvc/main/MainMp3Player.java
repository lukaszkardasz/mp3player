package pl.n2god.mp3player.mvc.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
        Pane mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Mp3 Player");
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
