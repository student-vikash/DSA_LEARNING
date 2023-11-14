package code_chef;

import java.util.Scanner;

public class Divisible5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int a = s.nextInt();
            String b = s.next();
            for (int i = 0; i < a; i++) {
                if (b.charAt(i) == '0' || b.charAt(i) == '5') {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }}
