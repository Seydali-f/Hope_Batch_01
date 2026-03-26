class Father{
    void display(){
        System.out.println("I am a father and I have  a son and daughter");
    }
}
class Son extends Father{
    void job(){
        System.out.println("Since you are going to job i am going to hand over the business to sister");
    }
}

class Daughter extends Father{
    void business(){
        System.out.println("I am going gto job so i don't have a proper time to manage the business so i am going to hand over the business to brother");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        son s = new son();
        daughter d = new daughter();

        s.display();
        s.job();

        d.display();
        d.business();
        }

}