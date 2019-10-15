package entertainment;

import java.util.ArrayList;

public class Video {

    private String title;
    private String director;

    public Video() {
    }

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "This video has title: "
                + getTitle()
                + ", director: "
                + getDirector();
    }
}
