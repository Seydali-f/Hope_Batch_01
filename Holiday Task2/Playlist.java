import java.util.ArrayList;

class Playlist {
    ArrayList<Video> videos = new ArrayList<>();

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void showPlaylist() {
        for (Video v : videos) {
            System.out.println(v.getTitle());
        }
    }
}