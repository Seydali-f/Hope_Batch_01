
interface A{
    void methodA();
   /*  void methodB(){
        System.out.println("This is method B");
    }*/
}
interface B{
    void methodC();
}

class c implements A,B{
    public  void methodA(){
        System.out.println("This is method A");
    }
    public void methodC(){
        System.out.println("This is method C");
    }
}

public class InterfaceExample{

    public static void main(String[] args) {
    
        c obj = new c();
        obj.methodA();
        //obj.methodB();
        obj.methodC();
    }
}
