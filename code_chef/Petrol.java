package code_chef;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        // testcases     =t

        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=s.nextInt();   // petrol in litre
            int b=s.nextInt();   // bike on the petrol pump in queue format.
            if(a%b==0)
            {
                int c=a/b;
                if(c%2==0)
                {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else {
                System.out.println("No");
            }
        }
    }
}
