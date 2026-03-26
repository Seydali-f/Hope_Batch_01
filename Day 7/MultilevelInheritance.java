class Animal{
    void  display(){
        System.out.println("There are many animals choose one and mention it's sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}
    class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
    }

public class MultilevelInheritance{
    public static void main(String[] args) {
        Dog sound = new Dog();
        Puppy p = new Puppy();
        p.display();    
        p.bark();
        p.weep();
        System.out.println(sound.hashCode());
    }

}