import java.util.ArrayList;

public class Album {
    String name;
    int year;
    ArrayList<Song> songs;

    Album(String name, int year) {
        this.name = name;
        this.year = year;
//        this.songs = ArrayList <>();

//        public void addSong (Song songs){
//            songs.add(songs)

    }

    public void listSongs() {
        System.out.println("Album: " + name + " (" + year + ")");
        for (Song s : songs) {
            System.out.println("- " + s.title + " (" + s.duration + ")");

        }
    }

    public void playAlbum() {
        System.out.println("Playing album: " + name);
        for (Song s : songs) {


        }
    }

    int getTotalDuration(){
        int total = 0;
        for (Song s : songs) {
            total += s.duration;
        }
        return total;
    }
}
