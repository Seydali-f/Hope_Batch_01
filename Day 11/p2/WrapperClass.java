public class WrapperClass{
    public static void main(String[] args){
      int a=10;
      System.out.println(a);
     Integer i=Integer.valueOf(a);
        System.out.println(i);
        System.out.println(a=i);
        ///System.out.println(a.hashCode());
        System.out.println(i.hashCode());
        String s="10";

        Integer i1=Integer.valueOf(s);
        Integer i2=Integer.parseInt(s);
        System.out.println(i1); 
        System.out.println(i2);
        String s2=Integer.toString(123);
        System.out.println(s2);

    }
}