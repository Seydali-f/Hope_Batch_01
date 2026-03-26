class Animal{
    void  display(){
        System.out.println("There are many animals choose one and mention it's sound");
    }
}
class Dog{
    void bark(){
        System.out.println("The dog barks");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        System.out.println(sound.hashCode());
    }

}