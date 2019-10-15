package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongsIterator {
    private SongInfo[] songs;

    public SongsOfThe80s() {
        this.songs = new SongInfo[] {
                new SongInfo("s1","B",1981),
                new SongInfo("s2","B",1980),
                new SongInfo("s3","B",1987)
        };
    }

    public SongInfo[] getSongs() {
        return songs;
    }

    public void setSongs(SongInfo[] songs) {
        this.songs = songs;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(this.songs).iterator();
    }
}
