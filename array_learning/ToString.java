package array_learning;

import java.util.Arrays;

public class ToString {
    public static void sortarr(int ar[]) {
        Arrays.sort(ar);
    }

    public void printarray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar));
        }
    }



    public  static void print(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

}
