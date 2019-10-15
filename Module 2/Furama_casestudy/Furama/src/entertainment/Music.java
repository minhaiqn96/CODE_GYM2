package entertainment;

import java.util.ArrayList;

public class Music {
    private String musicName;
    private String singer;

    public Music() {
    }

    public Music(String musicName, String singer) {
        this.musicName = musicName;
        this.singer = singer;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "This music has name: "
                + getMusicName()
                + ", singer: "
                + getSinger();
    }
}