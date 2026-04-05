class FreeUser extends User {

    public FreeUser(String username, String email, String password) {
        super(username, email, password);
    }

    public void watchVideo(Video video) {
        System.out.println(username + " watches ad before " + video.getTitle());
    }
}