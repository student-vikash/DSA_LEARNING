package string.revision;

import java.util.StringTokenizer;

public class Tokeniger1 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Vikash Software Solution");
        System.out.println("Total Tokens:" +st.countTokens());
        System.out.println("**************");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
