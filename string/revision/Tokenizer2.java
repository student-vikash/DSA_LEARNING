package string.revision;

import java.util.StringTokenizer;

public class Tokenizer2 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("You are so intelligent person.");
        System.out.println("Total Tokens: "+st.countTokens());
        System.out.println("**********************");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

    }
}
