package basic_revision;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AllBasic
{





    // method to find the factor of 2,3,4,5,6
    public static void factorOf()
    {
        int i=1;
        while (true)
        {
            if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0)
            {
                System.out.println("Factor is found "+i);
                break;
            }
            i++;
        }
    }





    // Method to find the sum,prod,rev,count of a given digit
    public static void reverseOf(int d)
    {
        int rev=0,count=0,sum=0,prod=1;
        while(d>0)
        {

            rev=rev *10 +(d%10);
            sum+=(d%10);
            prod*=(d%10);
            d/=10;
            count++;

        }
        System.out.println("Reverse is "+rev);
        System.out.println("Sum is "+sum);
        System.out.println("Prod is "+prod);
        System.out.println("Count is "+count);
    }




    // Method to find the pyramid

    public static void pyramidOf(int n)
    {
       for(int i=1;i<=n;i++)
       {
           // first print the space logic ( n-i )
           for(int j=1;j<=n-i;j++)
           {
               System.out.print("  ");
           }
           // Now printing pyramid using logic ( 2*i-1 )
           for(int j=1;j<=2*i-1;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }



    // Method to take input from user as their choice
    public static void userInput()
    {
        Scanner s=new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter your name please:");
            name=s.nextLine();
        }
        while (!name.equalsIgnoreCase("Developer"));
    }


    // Method to calculate a to the power of b

    public static void powerOf(int a,int b)
    {
        int b_stored=b;
        int p=a;
        while (b!=1)
        {
            p*=a;
            b--;
        }
        System.out.printf("%d to the power of %d is equal to %d",a,b_stored,p);
    }


    // Method to find the factorial

    public static void factorial(int n)
    {
        int fact=1;
        while (n!=1)
        {
            fact*=n;
            n--;
        }
        System.out.println("Factorial is "+fact);
    }


    // Method to find the sum,prod and count of a series like 1-2+3-4+5-....n

    public static void seriesSum(int n)
    {
        int sum=0,prod=1,count=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
            else{
                sum-=i;
            }
            prod*=i;count++;
        }
        System.out.println("Sum is "+sum+"  Prod is "+prod+"   Count is "+count);
    }




    // Method to print the all no of a series except multiple of 5 and 7

    public static void seriesExcept57mul(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%5==0 || i%7==0)
                continue;

            System.out.print(i+" ");
        }
    }


    // method to convert from binary to decimal

    public static void decimalCon(int b)
    {
        int dec=0;
        int power=1;
        while(b>0)
        {
            int unit_digit = ( b%10 );
            dec += (unit_digit * power);
            b/=10;
            power*=2;
        }
        System.out.println("Decimal no is "+dec);
    }



    // method to convert the decimal to binary

    public static void binaryCon(int d)
    {
        int b=0;
        int pw=1;
        while (d>0)
        {
            int parity = (d%2);
            b += (parity * pw);
            d/=2;
            pw *= 10;
        }
        System.out.println("Binary no is "+b);
    }




    // method to rotate an array by k size from last

    public static void rotateArray(int []ar,int k)
    {
        int n=ar.length;
        int ans[]=new int[n];
        int j=0;
        // traversing the last side array from n-k to n
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=ar[i];
        }
        // traversing the remaining first all elements from 0 to n-k
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        printArray(ans);

    }

    // method to print the array elements
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }


    // method to reverse an array
    public static void reverseArray(int []ar)
    {
        int left=0,right=ar.length-1;
        while (left<right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
        printArray(ar);
    }
    public static void main(String[] args) {
        //  factorOf();
        //  reverseOf(12345);
       // pyramidOf(7);
      //  userInput();
      //  powerOf(2,5);
       // factorial(6);
      //  seriesSum(6);
      //  seriesExcept57mul(7);
      //  decimalCon(1010);
      //  binaryCon(12);
        int []ar={5,2,3,1,8,6,4,2,9,7};
       // rotateArray(ar,3);
        reverseArray(ar);

    }
}
