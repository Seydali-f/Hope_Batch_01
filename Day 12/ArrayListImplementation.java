import java.util.ArrayList;
public class ArrayListImplementation{
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       list.add(null);
       list.add(1);
       list.add(2);
       System.out.println(list);
       list.set(0, 0);

         System.out.println(list);
         list.remove(1);
         System.out.println(list);
         System.out.println("list.contains(2) = " + list.contains(2)); 
         System.out.println(list.size());

       System.out.println(list); 
       System.out.println(list.lastIndexOf(list.get(0)));
       
    }
}