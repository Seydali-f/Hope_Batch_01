class PremiumUser extends User {

    public PremiumUser(String username, String email, String password) {
        super(username, email, password);
    }

    public void watchVideo(Video video) {
        System.out.println(username + " watches " + video.getTitle() + " without ads");
    }
}