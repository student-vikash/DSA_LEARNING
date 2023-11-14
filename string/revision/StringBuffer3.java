package string.revision;

public class StringBuffer3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("vikash");
        System.out.println(sb);
        System.out.println(sb.capacity());  // New capacity=initial capacity + current string size
    }
}
