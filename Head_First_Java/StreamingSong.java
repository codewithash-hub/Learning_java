package Head_First_Java;

class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void PrintDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}

class StreamingSongTestDrive {
    public static void main(String[] args) {
        
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.PrintDetails();
    }
}