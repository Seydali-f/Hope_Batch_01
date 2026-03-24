import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Perimeter of the rectangle : "+(2*(l+b)));
        System.out.println("Area of the rectangle : "+(l*b));
        sc.close();
    }
}