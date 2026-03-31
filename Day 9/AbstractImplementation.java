abstract class  Animal{
    abstract void sound();
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends  Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}

public class AbstractImplementation{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        a1.eat();
    } 
}
    
    