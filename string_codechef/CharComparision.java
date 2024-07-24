package string_codechef;

import java.util.Scanner;

public class CharComparision
{
    // method for checking two String char
    public static void charCompare(String s1,String s2)
    {

        String ans="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                ans+="A";
            }
            else
            {
                ans+="B";
            }
        }
        System.out.println(ans);
    }

    // method to check complete char equal or not
    public static void charCompare2()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your test case please:");
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter your first String please:");
            String s1=s.next();
            System.out.println("Enter your second String please:");
            String s2=s.next();

            if(s1.length() != s2.length())
            {
                System.out.println("Please enter same size String please:");
                return;
            }


            String ans="";
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)==s2.charAt(j))
                {
                    ans+="YES ";
                }
                else
                {
                    ans+="NO ";
                }
            }
            System.out.println("Your comparison based on character at index : "+ans);
        }
    }
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the first String please:");
//        String s1=s.nextLine();
//        System.out.println("Enter the second String please:");
//        String s2=s.nextLine();
//        charCompare(s1,s2);

        charCompare2();
     }
}
