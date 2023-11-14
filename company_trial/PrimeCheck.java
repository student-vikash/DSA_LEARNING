package company_trial;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        for (i = 2; i < n; i++) {
            if (n % i == 0)
            {
                System.out.println("Not Prime No");
            break;
        }}
        if (n == i) {
            System.out.println("Prime No");
        }
    }
}
