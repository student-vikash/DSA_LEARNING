package arr_stack_revi;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int ar[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("Enter the element at index "+(i+1)+" :");
            ar[i]=s.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

        System.out.println();

        System.out.println(ar[3]);
        System.out.println(ar[5]);
    }
}
