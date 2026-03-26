class Parent{
    void display(){
        System.out.println("I am inside the parent class");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("I am inside the child class");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}