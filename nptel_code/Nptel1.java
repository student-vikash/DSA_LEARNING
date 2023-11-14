package nptel_code;

import java.util.Scanner;

public class Nptel1 {
    public static void main(String[] args) {
        int i=10;
        int n=i++%2;
        int m=++i%7;
        System.out.println(i);
        System.out.println(n);
        System.out.println(m);
        System.out.println(i+n+m);
    }
}
