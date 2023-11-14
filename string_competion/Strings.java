package string_competion;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first String :");
        String s1=s.nextLine();
        System.out.println("Enter second String :");
        String s2=s.nextLine();
        if(s1.compareTo(s2)==0)

        /*  compateTo() gives +ve,if compared String is back ac. to character wise in alphabatic order.
           Gives 0 if both the content is equals
           Gives -ve if compared string is before ac. to character in alp. order.
         */


        {
            System.out.println("Both are equals");
        }
        else if (s1.compareTo(s2)>0)
        {
            System.out.println("First String is back ac. to alphabet.");
        }
        else {
            System.out.println("Second String is back ac. to alphabet.");
        }
    }
}
