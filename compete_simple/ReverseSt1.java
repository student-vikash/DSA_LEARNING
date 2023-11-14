package compete_simple;

import java.util.Scanner;

public class ReverseSt1 {
    public static String Reverse(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string please:");
        String str=s.nextLine();
        System.out.println("Reverse String is "+Reverse(str));
    }
}
