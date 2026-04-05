import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Video v1 = null;
        try {
            System.out.print("Enter video title: ");
            String title = sc.nextLine();
            System.out.print("Enter video duration: ");
            int duration = sc.nextInt();
            sc.nextLine();

            if (duration <= 0) {
                throw new IllegalArgumentException("Duration must be positive");
            }

             v1 = new Video(title, duration);
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Create password: ");
            String password = sc.nextLine();
            if (password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty");
            }
            System.out.println("1. Free User");
            System.out.println("2. Premium User");
            int choice = sc.nextInt();
            sc.nextLine();
            User user;
            if (choice == 1) {
                user = new FreeUser(username, email, password);
            } else if (choice == 2) {
                user = new PremiumUser(username, email, password);
            } else {
                throw new IllegalArgumentException("Invalid choice");
            }
            System.out.print("Enter password to login: ");
            String enteredPassword = sc.nextLine();
            if (user.login(enteredPassword)) {
                user.watchVideo(v1);
            } else {
                System.out.println("Wrong password!!!!!");
            }
            Playlist p = new Playlist();
            p.addVideo(v1);
            System.out.println("Playlist: ");
            p.showPlaylist();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}