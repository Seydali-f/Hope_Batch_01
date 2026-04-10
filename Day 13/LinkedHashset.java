import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
       s.add("aa");
       System.out.println(s);
       s.add("ab");
       System.out.println(s);
       s.add("bbb");
       s.add("cc");
       s.add("dd");
       s.add(" ");
       System.out.println(s);
    }
}