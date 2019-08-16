package pl.n2god.mp3player.mvc.mp3;

/*to klasyczna klasa JavaBeans. Przy tabelach Javy FX często spotkasz się także z wykorzystaniem obiektów StringProperty
zamiast String, jednak jest to użyteczne w sytuacji, gdy pola te będą edytowane. W naszym przypadku nie ma takiej potrzeby.*/

public class Mp3Song {
    private String author;
    private String title;
    private String album;
    private String filePath;

    public Mp3Song(String author, String title, String album, String filePath) {
        this.author = author;
        this.title = title;
        this.album = album;
        this.filePath = filePath;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Mp3Song [" +
                "title=" + title +
                ", author=" + author +
                ", album=" + album +
                "]";
    }
}
