public class DeleteFile {
    public static void main (String[] args) {
        File file = new File("hope_batch_1.txt");
        try {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            }
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
}