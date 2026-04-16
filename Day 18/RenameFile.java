import java.io.*;

public class RenameFile {
    public static void main( String[] args ) {
        File oldFile = new File("hope_batch_1.txt");
        File newFile = new File("hope_batch_1_renamed.txt");
        try {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("Failed to rename file");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}