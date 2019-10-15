package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongsIterator {
    private List<SongInfo> songsList = null;

    public SongsOfThe70s() {
        SongInfo[] songs = new SongInfo[]{
                new SongInfo("s1","A",1976),
                new SongInfo("s2","A",1978),
                new SongInfo("s3","A",1982)
        };
        this.songsList = Arrays.asList(songs);
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return songsList.iterator();
    }

    public List<SongInfo> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<SongInfo> songsList) {
        this.songsList = songsList;
    }
}
