package compete_simple;

import java.util.Scanner;

public class ReverseSt4 {

    public static StringBuilder Reverse(String str)
    {
        StringBuilder sbl=new StringBuilder(String.valueOf(str));
        return sbl.reverse();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=s.nextLine();
        System.out.println("Reverse string is "+Reverse(str));
    }
}
