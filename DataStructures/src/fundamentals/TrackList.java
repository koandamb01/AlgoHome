package fundamentals;

import java.util.HashMap;
import java.util.Set;

public class TrackList {
    private HashMap<String, String> tracks = new HashMap<String, String>();

    public TrackList(){}

    public void addNewTrack(String title, String lyric){
        tracks.put( title, lyric );
        System.out.println( title + " was add to the list!" );
    }

    public void printSongByTitle(String title){
        System.out.println( "Title: " + title + " lyric: " + tracks.get(title) );
    }

    public void printAllTracks(){
        Set<String> keys = tracks.keySet();
        for(String title : keys){
            System.out.println( "Title: " + title + " lyric: " + tracks.get(title)  );
        }
    }
}
