

public class MethodConcept {
    //Without Parameter and without return type
    public void square() {
        int num = 5;
        int result = num * num;
        System.out.println("Square: " + result);
    }

    //Without parameter and with return type
      public  int square1() {
        int num = 6;
        return num * num;
    }

    //With parameter and without return type
     public void square(int num) {
        int result = num * num;
        System.out.println("Square: " + result);
    }
    
    //With parameter and with return type
     public int square1(int num) {
        return num * num;
    }


    public static void main(String[] args) {
        MethodConcept obj = new MethodConcept();
        obj.square();
        obj.square(10);
        int result1 = obj.square1();
        System.out.println("Square: " + result1);   
        int result2 = obj.square1(7);
        System.out.println("Square: " + result2); 
    }
}