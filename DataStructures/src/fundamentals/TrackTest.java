package fundamentals;

public class TrackTest {
    public static void main(String[] args){
        TrackList trackList = new TrackList();

        trackList.addNewTrack( "2pac Dear Mama", "When I was young..." );
        trackList.addNewTrack( "2pac Changes" , "I see no changes, all I see is ....");

        trackList.printAllTracks();
    }
}
