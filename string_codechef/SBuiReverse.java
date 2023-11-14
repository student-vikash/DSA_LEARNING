package string_codechef;

public class SBuiReverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("vikash kumar rana");
        System.out.println("Without Reverse String: "+sb);
        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;

            char charfront=sb.charAt(front);
            char charback=sb.charAt(back);

            sb.setCharAt(front,charback);
            sb.setCharAt(back,charfront);
        }
        System.out.println("Reverse String: "+sb);
    }
}
