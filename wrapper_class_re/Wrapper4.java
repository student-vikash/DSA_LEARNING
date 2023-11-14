package wrapper_class_re;

import java.util.Scanner;

public class Wrapper4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Integer no:");
        int n=s.nextInt();
        Float fr=Float.valueOf(n);
        System.out.println("int in float="+fr);

        Double d=Double.valueOf(n);
        System.out.println("int in double="+d);
    }
}


