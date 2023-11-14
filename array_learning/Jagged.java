package array_learning;

import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[][]=new int[4][];
        ar[0]=new int[4];
        ar[1]=new int[3];
        ar[2]=new int[5];
       ar[3]=new int[7];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.println("Enter elements:");
                ar[i][j]=s.nextInt();
            }
        }
        int sum=0,count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
                sum=sum+ar[i][j];
                count++;
            }
            System.out.println();
        }
        System.out.println("****************");
        System.out.println("Sum="+sum);
        System.out.println("Total element="+count);
        System.out.println("Average="+(float)sum/count);
    }
}
