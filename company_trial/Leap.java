package company_trial;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n%100==0 && n%400==0) || (n%100!=0 && n%4==0))
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
