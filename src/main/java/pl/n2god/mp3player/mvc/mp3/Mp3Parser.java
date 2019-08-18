package pl.n2god.mp3player.mvc.mp3;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author n2god on 18/08/2019
 * @project mp3player
 */
public class Mp3Parser {
    public static Mp3Song createMp3Song(File file) throws IOException, TagException {
        MP3File mp3File = new MP3File(file);
        String absolutePath = file.getAbsolutePath();
        String title = mp3File.getID3v2Tag().getSongTitle();
        String author = mp3File.getID3v2Tag().getLeadArtist();
        String album = mp3File.getID3v2Tag().getAlbumTitle();
        return new Mp3Song(author, title, album, absolutePath);
    }

    public static List<Mp3Song> createMp3List(File dir) throws IOException, TagException {
        if (!dir.isDirectory()){
            throw new IllegalArgumentException("Not a directory");
        }
        List<Mp3Song> songList = new ArrayList<>();
        File[] files = dir.listFiles();
        for (File file : files) {
            int lastIndexOf = file.getName().lastIndexOf(".");
            String fileExtension = file.getName().substring(lastIndexOf + 1);
            if(fileExtension.equals("mp3")){
                songList.add(createMp3Song(file));
            }
        }
        return songList;
    }
}
