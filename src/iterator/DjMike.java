package iterator;

public class DjMike {
    public void showPlaylists(SongsIterator... playlists) {
        for(SongsIterator playlist : playlists) {
            System.out.println();
            playlist.createIterator().forEachRemaining(songInfo -> {
                System.out.println(songInfo);
            });
        }
    }
}
