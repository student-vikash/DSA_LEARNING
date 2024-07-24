package basic_revision;

import java.util.Scanner;

public class NestedLoop
{
    // method to use first nested
    public static void squareO()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=5;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // method to print the hollow square
    public static void hollowSq(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || j==1 || i==r || j==c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // method to print the left triangle
    public static void leftTriangle(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // method to print left Upper Triangle
    public static void leftUpperTriangle(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r+1-i);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

     }

     // method to print the pyramid
    public static void pyramidPattern(int r,int c)
    {
        for(int i=1;i<=r;i++) {
            // first we have to print spaces ( r-i )
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }

            // now we have to print the pyramid star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // method to print the numerical square pattern
    public static void numericalSquare(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=c;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    // method to print 1 or 2 on the basis of index sum in the loop
    public static void evenOdd(int r,int c)
    {
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");  // even then 1 which is opposite
                else
                    System.out.print("2 ");
            }
            System.out.println();
        }
    }

    // method to find the number pyramid
    public static void numPyramid(int r,int c) {
        for (int i = 1; i <= r; i++) {
            // first space
            for (int j = 1; j <= r; j++) {
                System.out.print(" ");
            }
            // print from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            // print i-1
            for (int p = i - 1; p >= 1; p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
        // method to reverse the digit
        public static void reverseDigit()
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the digit please:");
            int d=s.nextInt();

            int rev=0,sum=0,prod=1,count=0;
            while(d!=0)
            {
                rev=rev*10+(d%10);
                sum+=d%10;
                prod*=d%10;
                d/=10;
                count++;
            }
            System.out.println("Reverse digit is "+rev+"\nSum is "+sum+"\nProd is "+prod+"\nTotal count is "+count);
        }

    public static void main(String[] args) {
       //  squareO();
      //  hollowSq(5,5);
      //  leftTriangle(4,4);
      //  leftUpperTriangle(4,4);
      //  pyramidPattern(7,7);
     //   numericalSquare(5,5);
     //   evenOdd(5,6);
      //  numPyramid(7,7);
        reverseDigit();

    }
}
