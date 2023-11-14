package code_compete2;

import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int num=s.nextInt();
        int []x= new int[num];                       //  {2,3,4,5,6};
        int sum=0;

        for(int i=0;i<num;i++)
        {
            System.out.println("Enter element at index "+(i+1));
            x[i]=s.nextInt();
            sum=sum+x[i];
        }
        /*

         // Enhanced for loop

             for(int value:x)
             {
             sum=sum+value;
             }

         */

        System.out.println("Sum = "+sum);
    }
}
