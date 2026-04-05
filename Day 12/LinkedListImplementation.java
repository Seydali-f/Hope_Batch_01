import java.util.*;


public class LinkedListImplementation{
    public static void main(String[] args)
{
  List<String> runningrace=new LinkedList<>();
  runningrace.add("A");
  runningrace.add("B");
  runningrace.add("C");
  runningrace.addFirst("Start Race");
    runningrace.remove("B");
    System.out.println("B is disqualified");
    System.out.println(runningrace);
    runningrace.addLast("Race completed");
    System.out.println("A won the race 0.0ms");
    System.out.println(runningrace);



}}