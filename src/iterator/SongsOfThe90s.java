package iterator;

import java.util.HashMap;
import java.util.Iterator;

public class SongsOfThe90s implements SongsIterator {
    private HashMap<Integer, SongInfo> map;

    public SongsOfThe90s() {
        map = new HashMap<>();
        map.put(0,new SongInfo("s1","C",1991));
        map.put(1,new SongInfo("s2","C",1992));
        map.put(2,new SongInfo("s3","C",1995));
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return map.values().iterator();
    }

    public HashMap<Integer, SongInfo> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, SongInfo> map) {
        this.map = map;
    }
}
