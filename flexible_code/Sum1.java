package flexible_code;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1,sum=0;
        System.out.println("Enter the last digit:");
        int r=s.nextInt();
        while (i<=r)
        {
            sum=sum+i;i++;
        }
        System.out.println("Sum="+sum);


    }
}
