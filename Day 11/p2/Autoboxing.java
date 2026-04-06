public  class Autoboxing{
    public static void main(String[] args){
        int a=10;
        Integer i=a; 
        System.out.println(i);
        Integer a1=100;
        Integer b=100;
        System.out.println(a1==b);
        System.out.println(a1.equals(b));
        Character c1='z';
        Character c2='z';       
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
        Float f1=123F;
        Float f2=123F;
        System.out.println(f1==f2);
       // System.out.println(f1.equals(f2));

    }
}