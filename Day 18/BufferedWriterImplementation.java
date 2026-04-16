import java.io.*;

public class BufferedWriterImplementation {
    public static void main( String[] args ) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hope_batch_1.txt", true));
            writer.write("Here, we have turned the File Writer with true to append the data");
            writer.newLine();
            writer.write("Finally , I have closed the appending and writing operations");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}