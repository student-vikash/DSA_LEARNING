package string_competion;

public class ReverseStBui {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++)
        {

            int front=i;
            int back=sb.length()-1-i;



            char charfront=sb.charAt(i);
            char charback=sb.charAt(sb.length()-1-i);

            sb.setCharAt(front,charback);
            sb.setCharAt(back,charfront);
        }
        System.out.println("Reversed String :"+sb);
    }
}
