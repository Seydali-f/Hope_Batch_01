class Overloading{
    int c=10;
    int d=20;
    void add(){
        System.out.println("Addition of two numbers: "+(c+d));

    }
    void add1(int a,int b){
        System.out.println("Addition of two numbers: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Addition of three numbers: "+(a+b+c));
    }           
    void add(int a,int b,int c,int d){
        System.out.println("Addition of four numbers: "+(a+b+c+d));
    }
}
    class OverRiding extends Overloading{
        void add(){
            System.out.println("Overridden addition method");
        }
        void add(int a,int b){
            System.out.println("Overridden addition method with two parameters: "+(a+b));

        }
    }


public class MethodOverloading{
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.add1(5, 10);
        o.add(5, 10, 15);
        o.add(5, 10, 15, 20);
        Overloading or=new OverRiding();
        or.add();
        or.add1(5, 10);
    }
}