import java.util.Scanner;
import java.util.Random;

public class SubwaySurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int track = 2; 
        boolean gameOver = false;

        System.out.println("=== Subway Surfers Game ===");

        while (!gameOver) {
            int obstacleTrack = rand.nextInt(3) + 1;
            int obstacleType = rand.nextInt(4) + 1;

            String obstacle = "";

            switch (obstacleType) {
                case 1:
                    obstacle = "Low Barrier";
                    break;
                case 2:
                    obstacle = "Train";
                    break;
                case 3:
                    obstacle = "Fence";
                    break;
                case 4:
                    obstacle = "High Barrier";
                    break;
            }

            System.out.println("\nObstacle: " + obstacle + " on Track " + obstacleTrack);
            System.out.println("You are on Track " + track);
            
            System.out.println("R - Run");
            System.out.println("A - Move Left");
            System.out.println("S - Move Right");
            System.out.println("W - Jump");
            System.out.println("D - Slide");
            System.out.println("Q - Quit");

            System.out.print("Enter choice: ");
            int choice = sc.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'R':
                    if(track != obstacleTrack){
                        System.out.println("Obstacle avoided");
                    }
                    else{
                        gameOver = true;
                        System.out.println("You Lost");
                    }
                    break;
                case 'A':
                    if (track > 1) {
                        track--;
                        System.out.println("Moved Left to Track " + track);
                    } else {
                        System.out.println("Already on left track!");
                    }
                    
                    if(track != obstacleTrack){
                        System.out.println("Obstacle cleared");
                        continue;
                    }
                    else{
                        System.out.println("Hit Obstacle, failed");
                        gameOver = true;
                    }
                    break;

                case 'S':
                    if (track < 3) {
                        track++;
                        System.out.println("Moved Right to Track " + track);
                    } else {
                        System.out.println("Already on right track!");
                    }
                    
                    if(track != obstacleTrack){
                        System.out.println("Obstacle cleared");
                        continue;
                    }
                    else{
                        System.out.println("Hit Obstacle, failed");
                        gameOver = true;
                    }
                    break;

                case 'W':
                    if (track == obstacleTrack &&
                        (obstacle.equals("Low Barrier") || obstacle.equals("Fence"))) {
                        System.out.println("Jump successful!");
                    } else if (track == obstacleTrack) {
                        System.out.println("Wrong move! Crashed!");
                        gameOver = true;
                    }
                    break;

                case 'D':
                    if (track == obstacleTrack && (obstacle.equals("High Barrier") || obstacle.equals("Fence"))) {
                        System.out.println("Slide successful!");
                    } else if (track == obstacleTrack) {
                        System.out.println("Wrong move! Crashed!");
                        gameOver = true;
                    }
                    break;

                case 'Q':
                    gameOver = true;
                    System.out.println("Game Over!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}