package sorting_learning;
import java.util.*;
public class Bubble {
    public static void printArray(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[]={7,8,3,2,1};
        //  Time complexity= O(n^2)
        //  Bubble sort

        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    //Swap
                    int temp;
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        printArray(ar);
    }


}
