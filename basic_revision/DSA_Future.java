package basic_revision;

import java.util.Scanner;

public class DSA_Future
{
    // method to print multiple of 3 and 5
    public static void multipleOf(int val)
    {
        while(true)
        {
            if((val % 3 ==0) && (val % 5==0)){
                System.out.println("Num found is "+val);
                break;
            }
            val++;
        }
    }

    // method to find no which is divisible by 3 and 4
    public static void divideMethod(int val)
    {
        while(true)
        {
            if((val % 3 ==0) && (val % 4==0))
            {
                System.out.println("Num found is "+val);
                break;
            }
            val++;
        }
    }

    // method to print sum based on user input
    public static void sumMethod(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first no in sum series:");
        int num=s.nextInt();
        int sum=0;
        int prod=1;
        do{
            sum+=num;
            prod*=num;
            num=s.nextInt();
        }
        while (num != -1);
        System.out.println("Total sum is "+sum);
        System.out.println("Total prod is "+prod);
    }

    // method to print all numbers except  multiple of  5 between a valid range
    public static void continueUse(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if((i%5==0))
            {
                continue;
            }
            System.out.print(i+"  ");
        }
    }

    // method to print all odd numbers between a valid range
    public static void oddNumbers(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
                continue;

            System.out.print(i+"  ");
        }
    }

    // method to operate assignment operator
    // method to find all factor of a number except 1
    public static void countDivisibleValue(int start,int end)
    {
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i % 3 !=0)
                continue;

            System.out.print(i+"  ");
        }
    }

    // find all factors of 7 between a valid range
    public static void factorOfSeven(int start,int end) {
        for (int i = start; i <= end; i++) {
            if (i % 7 != 0)
                continue;

            System.out.print(i + "  ");
        }

    }

    // method to count digit numbers
    public static void countDigitNumber(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;count++;
        }
        System.out.println("Total digit number is "+count);
    }

    // method to find sum and count of a digit numbers
    public static void sumAndCount(int n)
    {
        int sum=0,count=0;
        while (n>0)
        {
            sum+=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Sum is "+sum+"\nCount is "+count);
    }

    // method to reverse a digit
    public static void reverseDigit(int d)
    {
        int ans=0;
        while(d>0){
            ans=(ans*10)+(d%10);
            d=d/10;
        }
        System.out.println("Reverse digit is "+ans);
    }

    // Find the sum of this series  1-2+3-4+5-6....n
    public static void evenOddSeriesSum(int n)
    {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0) {
                ans -= i;
            }
            else {
                ans+=i;
            }
        }
        System.out.println("Series sum is "+ans);
    }

    // method to find the factorial
    public static void factoRial(int n)
    {
        int fact=1;
        while(n>=1)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+n+"is "+fact);
    }

    // method to calculate a to the power b of a number
    public static void powerOf(int a,int b)
    {
        int p=a;
        while (b!=1)
        {
            p=p*=a;
            b--;
        }
        System.out.println("Power is "+p);
    }

    // Method to find a number which is a factor of 2,3,4,5,6,7 and 8

    public static void factorOf(int val)
    {
        while(true)
        {
            if(val%2==0 && val%3==0 && val%4==0 && val%5==0 && val%7==0)
            {
                System.out.println("Number is found "+val);
                break;
            }
            val++;
        }
    }

    // Method to take valid book name from user
    public static void validBookName() {
        Scanner s = new Scanner(System.in);
        String bname;
        do {
            System.out.println("Enter your book name please:");
            bname = s.nextLine();
        }

        while (!bname.equalsIgnoreCase("math"));
    }

    // codechef question
    public static void arrayQ()
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int max=0;
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int ar[]=new int[n];

            for(int j=0;j<n;j++)
            {
                ar[j]=s.nextInt();
                if(max>ar[j])
                {
                    max=ar[j];
                }
            }
            System.out.println("Maximum element is "+max);
        }
    }

    // method to print the pyramid pattern
    public static void pyramidPattern(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            // first print the space r-i
            for(int j=1;j<=r-i;j++)
            {
                System.out.print("  ");
            }
            // now print all pyramid stars 2*i-1
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // method to convert the decimal no into binary  digit
    public static void decimalBinary(int d)
    {
        int b=0,pw=1;
        while(d>0)
        {
            int parity=d%10;
            b+=(parity*pw);
            pw*=10;
            d/=10;
        }
        System.out.println("Binary digit is "+b);
    }

    // method to convert the binary digit into decimal digit
    public static void binaryDecimal(int b)
    {
        int d=0,pw=1;
        while (b>0)
        {
            d+=(b%10)*pw;
            pw*=2;
            b/=10;
        }
        System.out.println("Decimal no is "+d);
    }




    public static void main(String[] args) {
       // multipleOf(1);
       // divideMethod(1);
       //  sumMethod();
     //   continueUse(1,20);
      //   oddNumbers(1,20);
      //  countDivisibleValue(1,20);
       // factorOfSeven(7,100);
       // countDigitNumber(12345679);
       // sumAndCount(123456789);
       //  reverseDigit(12345);
      //  evenOddSeriesSum(15);
      //  factoRial(5);
       // powerOf(2,5);
      //  factorOf(1);
       // validBookName();
       // arrayQ();
      //  pyramidPattern(5,5);
       decimalBinary(9);
      //  binaryDecimal(1001);

    }

}
