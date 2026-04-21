/*
Write a Java program to simulate a Music Playlist using LinkedList<String>.
Perform the following operations:  
1. Add songs to the playlist.  
2. Display the full playlist. 
3. Play the first song (remove from front).  
4. Skip the last song (remove from end).  
5. Display the updated playlist after each operation.
*/

import java.util.*;

public class p31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist :");
        System.out.println(playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying : " + firstSong);
        System.out.println("Playlist after playing first song :");
        System.out.println(playlist);

        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped : " + lastSong);
        System.out.println("Playlist after skipping last song :");
        System.out.println(playlist);
    }
}
