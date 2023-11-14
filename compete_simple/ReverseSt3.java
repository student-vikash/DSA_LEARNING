package compete_simple;

import java.util.Scanner;

public class ReverseSt3 {

    public static StringBuffer Reverse(String str)
    {
        StringBuffer sb=new StringBuffer(String.valueOf(str));
        return sb.reverse();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string please : ");
        String str=s.nextLine();
        System.out.println("Reverse String is "+Reverse(str));
    }
}
