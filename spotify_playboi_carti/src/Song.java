

public class Song {
    String title;
    int duration;

    Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

        public void play() {
            System.out.println("Playing: " + title + "(" + duration + "s)");
        }
    }
