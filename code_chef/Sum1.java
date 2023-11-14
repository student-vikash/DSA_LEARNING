package code_chef;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
             int n=s.nextInt();
             int sum=0;
            while(n>0)
            {
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            System.out.println(sum);
        }

    }
}
