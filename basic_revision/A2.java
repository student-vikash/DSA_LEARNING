package basic_revision;

import java.util.Scanner;

public class A2
{
    // method to take input in 2 d array
    public static void inputElements()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your total row and column:");
        int r=s.nextInt();
        int c=s.nextInt();
        System.out.println("Enter "+r*c+" elements please: ");
        int [][]ar=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        System.out.println("Actual matrix is ");
        printElements(ar);

        System.out.println();

        addTwoMatrix(ar,r,c,ar,r,c);

        multipleMatrix(ar,r,c,ar,r,c);


    }

    // method to print the array elements
    public static void printElements(int [][]apr)
    {
        for(int i=0;i< apr.length;i++)
        {
            for(int j=0;j< apr.length;j++)
            {
                System.out.print(apr[i][j]+" ");
            }
            System.out.println();
        }
    }


    // method to find the sum of two matrix
    public static void addTwoMatrix(int [][]m1,int r1,int c1,int [][]m2,int r2,int c2)
    {
       if(r1!=r2 || c1!= c2) {
           System.out.println("Addition is not possible -- Wrong dimension check please:");
           return;
       }

           for(int i=0;i<r1;i++)
           {
               for(int j=0;j<c1;j++)
               {
                   m1[i][j]=m1[i][j] + m2[i][j];
               }
           }
        System.out.println("Addition matrix is ");
           printElements(m1);

    }

    // method to multiply two matrix
    public static void multipleMatrix(int [][]m1,int r1,int c1,int [][]m2,int r2,int c2)
    {
        if(r1 !=c2 || c1  !=  r2) {
            System.out.println("Multiplication is not possible -- Wrong dimension check please:");
            return;
        }

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
               for(int k=0;k<c1;k++)
               {
                   m1[i][j]+= m1[i][k] * m2[k][j];
               }
            }
        }

        System.out.println("Multiplication matrix is ");
        printElements(m1);
    }
    public static void main(String[] args) {
        inputElements();
        int [][]ar={{2,2},{2,2}};
       // addTwoMatrix(ar,2,2,ar,2,2);
    }
}
