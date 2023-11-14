package array_learning;

import java.util.Arrays;

public class SortTwo {
    public static void main(String[] args) {
        int ar1[]={2,6,3,9,5};
        int ar2[]={12,7,4,14,76};

        int ar3length=ar1.length+ar2.length;

        int ar3[]=new int[ar3length];
        for(int i=0;i<ar1.length;i++)
        {
            ar3[i]=ar1[i];
        }
        for(int i=0;i<ar2.length;i++)
        {
            ar3[ar1.length+i]=ar2[i];
        }

        for(int i=0;i<ar3length;i++)
        {
            System.out.print(ar3[i]+" ");
        }

        System.out.println();
        
        Arrays.sort(ar3);
        for(int i=0;i<ar3.length;i++)
        {
            System.out.print(ar3[i]+" ");
        }
    }
}
