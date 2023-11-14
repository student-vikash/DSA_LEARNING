package string.revision;

public class StringBufferReverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Vikash Software Solution");
        System.out.println("Real Object:"+sb);
        System.out.println("Reverse Object: "+sb.reverse());
        sb.delete(8,16);
        System.out.println(sb);
    }
}
