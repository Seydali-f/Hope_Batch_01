import java.lang.StringBuffer;
public class StringBufferConcept {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println("After append: " + sb);
        sb.insert(4, " Language");
        System.out.println("After insert: " + sb);
        sb.replace(0, 4, "Core");
        System.out.println("After replace: " + sb);
        sb.delete(4, 13);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}