package array_7th_round;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class FrequencyYesNo {


    public static int []makeFrequency(int []ar)
    {
        int []freq=new int[100005];
        for(int i=0;i<ar.length;i++)
        {
            freq[ar[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int []ar=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        int []freq=makeFrequency(ar);

        System.out.println("Enter the no of queries ");
        int q=s.nextInt();

        while(q>0)
        {
            System.out.println("Enter the no to be searched ");
            int x=s.nextInt();
            if(freq[x]>0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No not found ");
            }
            q--;
        }
    }
}
