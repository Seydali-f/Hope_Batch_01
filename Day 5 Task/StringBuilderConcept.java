import java.lang.StringBuilder;
public class StringBuilderConcept {
      public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(5, " Beautiful ");
        System.out.println("After insert: " + sb);
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Character at index 1: " + sb.charAt(4));
        sb.setCharAt(0, 'M');
        System.out.println("After setCharAt: " + sb);
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}