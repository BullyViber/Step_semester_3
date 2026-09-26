import java.util.Scanner;

class Playlist {
    private String[] songs;
    private int songCount;

    Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    public String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    public int getSongCount() {
        return songCount;
    }
}

public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum playlist size: ");
        int maxSize = sc.nextInt();
        sc.nextLine();

        Playlist p = new Playlist(maxSize);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            p.addSong(song);
        }

        String[] copy = p.getSongs();

        System.out.println("\nSongs in playlist:");
        for (String song : copy) {
            System.out.println(song);
        }

        System.out.println("Song count: " + p.getSongCount());

        System.out.print("\nEnter a new value to modify the returned array: ");
        copy[0] = sc.nextLine();

        System.out.println("Modified returned array: " + copy[0]);

        String[] actualSongs = p.getSongs();
        System.out.println("Actual first song in playlist: " + actualSongs[0]);

        sc.close();
    }
}