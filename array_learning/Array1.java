package array_learning;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int ar[];
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();int n;
        ar=new int[t];
        for(int i=0;i<t;i++) {
            // ar[]= s.nextInt();
            ar[i] = s.nextInt();
        } int count=0;
            for(int i=0;i<ar.length;i++)
            {
               // if(ar[n]>=1000)
                    count++;
        System.out.println(count);}
        }
    }

