package code_chef;

import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {  int n=s.nextInt();
        while(n>0)
        {
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }}
}
