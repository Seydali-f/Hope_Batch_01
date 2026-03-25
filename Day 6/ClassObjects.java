class Apartment {
    public void display(){
        System.out.println("I'm inside Apartment");
        
    }
}
public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("I'm inside class objects!!");
        Apartment ap = new Apartment();
        ap.display();
    }
}