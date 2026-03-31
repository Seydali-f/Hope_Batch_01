interface Salary{
    void salary();
}

class PartTime implements Salary{

    int amount=2000;
    String name;
    String empid;
    PartTime(String name,String empid,int hours){
        this.name=name;
        this.empid=empid;
        amount=hours*amount;
    }
   public void salary(){
    System.out.println("name: "+name+"\nempid: "+empid+"\nsalary: "+amount);
    }

}
  
class FullTime implements Salary{
    int amount=200000;
    String name;
    String empid;
    FullTime(String name,String empid){
        this.name=name;
        this.empid=empid;
  
  }
    public void salary(){
        System.out.println("name: "+name+"\nempid: "+empid+"\nsalary: "+amount);

    }
  }

public class InterfaceScenario{
    public static void main(String[] args) {
        Salary s=new PartTime("kavi","24cs",60);
        s.salary();
        Salary s1=new FullTime("Mithra","45cs");
        s1.salary();

    }

}