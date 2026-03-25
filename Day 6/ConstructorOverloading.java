class CrOverloading{
    
    public CrOverloading(){
        System.out.println("default constructor");
    }
    public CrOverloading(int x){
    
        System.out.println(" parameterized constructorand Overloading, The value is: " + x);
    }
        public CrOverloading(String x){
        System.out.println(" parameterized constructorand Overloading, The String is: " + x);
        }
    }
    public class ConstructorOverloading {
    public static void main(String[] args) {
        CrOverloading obj1 = new CrOverloading("hope batch 1");

        CrOverloading obj2 = new CrOverloading(10);
    }

}