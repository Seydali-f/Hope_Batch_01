import java.util.*;
public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1);
        System.out.println(arr1[1]);
        System.out.println("Hash code of arr1[0]: " + Integer.hashCode(arr1[1]));
        Integer[] arr4 = {1, 2, 3};
        System.out.println(arr4);
        System.out.println(arr4[0].hashCode() == 1);
        Integer a = 1;
        System.out.println(a.hashCode());
        System.out.println(a.hashCode()== arr4[0].hashCode());
        sc.close();
    }
}