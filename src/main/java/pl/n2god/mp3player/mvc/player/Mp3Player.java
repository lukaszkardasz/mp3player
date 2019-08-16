package pl.n2god.mp3player.mvc.player;

import javafx.collections.ObservableList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import pl.n2god.mp3player.mvc.mp3.Mp3Song;

/**
 * @author n2god on 16/08/2019
 * @project mp3player
 */
public class Mp3Player {
    private ObservableList<Mp3Song> songList;

    private Media media;
    private MediaPlayer mediaPlayer;

    public Mp3Player(ObservableList<Mp3Song> songList) {
        this.songList = songList;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void play(){
        if(mediaPlayer != null && (mediaPlayer.getStatus()) == MediaPlayer.Status.READY || (mediaPlayer.getStatus()) == MediaPlayer.Status.PAUSED){
            mediaPlayer.play();
        }
    }

    public void stop() {
        if(mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.pause();
        }
    }
}
