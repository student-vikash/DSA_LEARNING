package string_competion;

import java.util.Scanner;

public class Test
{
    // method to make char array
    public static char[] makeArray()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of char array:");
        int n=s.nextInt();
        char []ar=new char[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.next().charAt(0);
        }
        printElements(ar);
        return ar;
    }

    // method to make the String array
      public static String[] stringArray()
      {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the size of String array:");
          int n=s.nextInt();
          String []ar=new String[n];
          for(int i=0;i<ar.length;i++)
          {
              ar[i]=s.next();

          }
          printStrings(ar);
          return ar;
      }

      // method to split the character of String
      public static void splitString(String str)
      {
       String [] ar=str.split(str);
       for(int i=0;i<ar.length;i++)
       {
           System.out.print(ar[i]+" ");
       }
      }

      // method to print the all String elements
    public static void printStrings(String []ar)
    {
       for(int i=0;i<ar.length;i++)
       {
           System.out.print(ar[i]+" ");
       }


    }
    // method to print array elements
    public static void printElements(char []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
      //  makeArray();
      //  stringArray();
        splitString("vikash");
    }
}
