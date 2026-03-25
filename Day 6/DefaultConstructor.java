class dConstructor{

    public dConstructor(int x) {
        //this.x = x;
        System.out.println("I am inside parameterized constructor");

    }
}
    public class DefaultConstructor {
    public  DefaultConstructor(){
        System.out.println("I am inside default constructor");
    }
    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();
        System.out.println("See your class automatically creates a default constructor");
    }
}