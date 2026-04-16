import java.io.*;

public class FileWriterImplementation {
    public static void main( String[] args ) {
        try {
            FileWriter writer = new FileWriter("hope_batch_1.txt");
            writer.write("Welcome to File Handling\nThis is Hope Batch 1\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
