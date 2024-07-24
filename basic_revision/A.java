package basic_revision;

import java.util.Scanner;

public class A {
    // method to find a n which is a factor of 2,3,4,5,6,7
    public static void factorOf() {
        int i = 1;
        while (true)
        {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0) {
                System.out.println("No is found " + i);
                break;
            }
            i++;
        }
    }

    // method to find the sum,rev,prod,...
    public static void reverseOf() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit as you want:");
        int d = s.nextInt();

        int sum = 0, prod = 1, count = 0, rev = 0;

        while (d != 0) {
            sum += d % 10;
            prod *= d % 10;
            rev = rev * 10 + (d % 10);
            d /= 10;
            count++;
        }
        System.out.println("Your reverse digit is " + rev + "\nTotal sum is " + sum + "\nTotal prod is " + prod + "\nTotal count is " + count);
    }

    // method to print the pyramid
    public static void pyramidOf(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // first print space with relation i-1
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // now actual star with relation 2*i-1
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // method to take input from the user as per their requirement
    public static void userInput()
    {
        Scanner s=new Scanner(System.in);
        String name;
        do{
            System.out.println("Enter your name please:");
            name=s.nextLine();
        }
        while(!name.equalsIgnoreCase("vikash"));
    }

    // method to find the power of a to the power of b
    public static void powerOf(int a,int b)
    {
        int p=a;
        while (b!=1){
            p*=a;
            b--;
        }
        System.out.println("Your power value is "+p);
    }
    // method to find the factorial of a number
    public static void factorialOf(int n)
    {
        int fact=1;
        while (n!=1) {
            fact *= n;
            n--;
        }

        System.out.println("Factorial  is "+fact);
    }

    // method to find the sum and prod of a series like 1-2+3-4+5-6....
    public static void seriesSumProd(int n)
    {
        int sum=0,prod=1,count=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum-=i;
            }
            else{
                sum+=i;
            }
            prod*=i;
            count++;
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod+"\nTotal count is "+count);
    }
    // method to print all numbers of a series except the multiple of 5 ans 7
    public static void allNumbersIS(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%5==0 || i%7==0)
                continue;
            System.out.print(i+" ");
        }
    }

    // method to convert from binary to decimal
    public static void binaryDecimal(int b)
    {
        int deci=0;   // converted decimal
        int power=1;
        while(b>0)
        {
            int unit_digit=b%10;
            deci+=(unit_digit * power);
            b/=10;
            power*=2;
        }
        System.out.println("Decimal no is "+deci);
    }

    // method to convert from decimal to binary
    public static void decimalBinary(int d)
    {
        int binary=0; // converted binary digit
        int pw=1;
        while (d>0)
        {
            int parity=d%2;
            binary+=(parity*pw);
            pw*=10;
            d/=2;
        }
        System.out.println("Binary digit is "+binary);
    }

    // method to print the pyramid shape
    public static void pyramidShape(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            // confirm space with relation r-i
            for(int j=1;j<=r-i;j++)
            {
                System.out.print("  ");
            }
            // now print all star with relation 2*i-1
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // method to find the sum,prod,count and reverse of a given digit
    public static void sumReverseCount(int d)
    {
        int sum=0,prod=1,rev=0,count=0;
        while (d>0)
        {
            sum+=d%10;prod*=d%10;rev=rev*10+(d%10);
            d/=10;count++;
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod+"\nReverse is "+rev+"\nTotal count is "+count);
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
    public static int[] reverseArray(int []ar)
    {
        int left=0,right=ar.length-1;

        while(left<right)
        {
            int temp=ar[left];
             ar[left]=ar[right];
             ar[right]=temp;
             left++;
             right--;
        }
        printArray(ar);
        return ar;
    }

    // method to rotate the array
    public static int [] rotateAr(int []ar,int k)
    {
        int n=ar.length;
        int []ans=new int[n];
        int j=0;
        // traverse the second part from n-k to n or last
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=ar[i];
        }
        // remaining first part also add in the returning array
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        printArray(ans);
        return ans;
    }


    public static void main(String[] args) {
      //   factorOf();
      //  reverseOf();
      //  pyramidOf(5);
      //  userInput();
      //  powerOf(2,5);
      //  factorialOf(5);
      //  seriesSumProd(10);
      //  allNumbersIS(30);
      //  binaryDecimal(1001);
        decimalBinary(11);
       // pyramidShape(5,5);
      //  sumReverseCount(12345);
       //  int ar[]={2,3,1,5,6,8};
      //  reverseArray(ar);
       //  rotateAr(ar,5);

    }
}
