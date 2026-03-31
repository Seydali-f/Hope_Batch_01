public class TaskException{
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }}
