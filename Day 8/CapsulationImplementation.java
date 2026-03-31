class Encapsulation{
    int a;
    Encapsulation(){
        a=10;

    }
    void display(){
        System.out.println("Implentation of Encapsulation");

    }
    }

public class CapsulationImplementation{
    public static void main(String[] args) {
        Encapsulation ec=new Encapsulation();
        ec.display();
        
    }
}