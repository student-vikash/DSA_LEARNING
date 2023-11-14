package dsa_series;

import java.util.Arrays;
import java.util.Scanner;

public class ChocalateDis {

    // method to find minimum gap between window (minimize gap)

    public static int find(int ar[],int n,int m)
    {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(ar);

        for(int i=0;i<n-m;i++)
        {
            int minw=ar[i];
            int maxw=ar[i+m-1];
            int gap=maxw-minw;

            if(gap<ans)
            {
                ans=gap;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int m=s.nextInt();
        int ans=find(ar,n,m);
        System.out.println(ans);
    }
}
