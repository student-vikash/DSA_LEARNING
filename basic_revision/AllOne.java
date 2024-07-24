package basic_revision;

import java.util.Scanner;

public class AllOne
{
    /* // method to find all odd nos between a valid range
    public static void oddNos(int start,int end)
    {
        int sum=0,prod=1,count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2!=0)
                continue;

            sum+=i;prod*=i;count++;

        }
        System.out.println("All odd nos sum is "+sum+"\nAll odd prod is "+prod+"\nAll odd nos is "+count);
    }


    // method to find all multiple of 7
    public static void sevenMultiple(int start,int end)
    {
        int sum=0,prod=1,count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%7!=0)
            continue;

            count++;
            sum+=i;
            prod*=i;
        }
        System.out.println("Sum of all factor of 7 is "+sum+"\nProd of all factor of 7 is "+prod+"\nTotal no of factor of 7 is (here) "+count);
    }


    // method to find the factor 7 and 5 both
     public static void fiveSevenFactor(int val){
        while(true)
        {
            if((val%5==0) && (val%7==0))
            {
                System.out.println("Your searching factor is " + val);
                break;
            }
            val++;
        }
     }


     */
     // method for finding a factor of 4 numbers
    public static void factorOfNumbers(int val)
    {
        while(true)
        {
            if((val%2==0) && (val%3==0) && (val%4==0) &&(val%5==0) && (val%7==0))
            {
                System.out.println("Your finding factor no is "+val);
                break;
            }
            val++;
        }
    }

    // method to take first character of your name
    public static void yourNameChar(char ch){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first character here: ");
        char c=s.next().charAt(0);
        System.out.println("Name's first character is "+c);
    }

    // method for addition of numbers according to user inputs
    public static void additionNumbers()
    {
        int sum=0,num;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter numbers here:");
             num=s.nextInt();
            sum+=num;
        }
        while (num!=-1);
        System.out.println("Sum is "+sum);
    }

    // Taking input from the user while he doesn't cross 100
    public static void userNumberInputs(){
        Scanner s=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter your number please : ");
            num=s.nextInt();
            System.out.println("You entered valid number.");
        }
        while (num<=100);

    }

    // method to take valid marks of a Student
    public static void validMarks()
    {
        Scanner s=new Scanner(System.in);
        int marks;
        do{
            System.out.println("Enter your marks please :");
            marks=s.nextInt();
            System.out.println("You entered a valid marks!");
        }
        while (marks>0 && marks<=100);
    }

    // method to count digit no
    public static void digitCount(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;count++;
        }
        System.out.println("Total digit no is "+count);
    }

    // method to count and sum all numbers in a digit
    public static void sumCountDigit(int n)
    {
        int count=0,sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Sum is "+sum+"\nTotal numbers in digit is "+count);

    }

    // series solution  1-2+3-4+5-6+...+n
    public static void evenOddSeriesSum(int start,int end)
    {
        int sum=0,count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                sum-=i;
            }
            else {
                sum+=i;
            }
            count++;
        }
        System.out.println("Total sum is "+sum+"\nTotal numbers are "+count);
    }

    // Method to find sum and prod of all factors of 5 between a valid range
    public static void sumProdFiveFactor(int start,int end)
    {
        int sum=0,count=0,prod=1;
        for(int i=start;i<=end;i++)
        {
            if(i%5==0)
            {
                sum+=i;
                prod*=i;
            }
            count++;
        }
        System.out.println("Sum of 5 factor is "+sum+"\nProd of 5 factor is "+prod+"\nTotal numbers in the series is "+count);
    }

    // method to find the factorial of a number
    public static void factorRial(int n)
    {
        int fact=1;
        while(n!=1)
        {
            fact*=n;
            n--;
        }
        System.out.println("Your factorial is "+fact);
    }

    // method to find the a to the power b
    public static void powerOf(int a,int b)
    {
        int p=a;
        while (b!=1)
        {
            p*=a;
            b--;
        }
        System.out.println("Your final result is "+p);
    }

    // method to find sum of all numbers present in a digit
    public static void sumProdDigit(int d)
    {
        int count=0,sum=0,prod=1;
        while(d!=0)
        {
            sum+=(d%10);prod*=(d%10);
            d/=10;
            count++;
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod+"\nCount is "+count);
    }

    // method to find reverse digit of a given digit
    public static void reverseDigit(int d)
    {
        int count=0,sum=0,prod=1,rev=0;
        while (d!=0)
        {
           rev=(rev*10)+(d%10);
           sum+=(d%10);
           prod*=(d%10);
           d/=10;
           count++;
        }
        System.out.println("Reverse digit is "+rev+"\nSum is "+sum+"\nProd is "+prod+"\nCount is "+count);
    }

    // method to convert the binary digit into decimal
   public static void b_Decimal(int binary)
   {
       int deci=0,pw=1;
       while(binary>0)
       {
           deci+=(binary%10)*pw;
           binary/=10;
           pw*=2;
       }
       System.out.println("Your converted decimal is "+deci);
   }

   // method to convert the decimal into binary digit
    public static void d_Binary(int deci)
    {
        int b=0,pw=1;
        while(deci>0)
        {
            int parity=deci%10;
            b+=parity*pw;
            pw*=2;
            deci/=10;
        }
        System.out.println("Your converted binary digit is "+b);
    }
    public static void main(String[] args) {
       //  oddNos(1,30);
       // sevenMultiple(1,20);
       //  fiveSevenFactor(1);
       // factorOfNumbers(1);
       // yourNameChar('v');
       //  additionNumbers();
      //  userNumberInputs();
       //  validMarks();
       // digitCount(1234545667);
      //  sumCountDigit(12345);
      //  evenOddSeriesSum(1,10);
      //  sumProdFiveFactor(1,20);
       // factorRial(5);
      //  powerOf(2,5);
      //  sumProdDigit(-1234);
      //  reverseDigit(12345);
      //  b_Decimal(1001);
        d_Binary(9);

    }
}
