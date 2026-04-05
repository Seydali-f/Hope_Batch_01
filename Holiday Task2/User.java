abstract class User {
    protected String username;
    protected String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public abstract void watchVideo(Video video);
}