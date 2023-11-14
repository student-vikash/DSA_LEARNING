package wrapper_class_re;

import java.util.Scanner;

public class Wrapper6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an int value:");
        int a=s.nextInt();
        System.out.println("Enter a float value:");
        float fr=s.nextFloat();
        System.out.println("Enter a long value:");
        long lr=s.nextLong();
        System.out.println("Enter a double value:");
        double dr=s.nextDouble();

        String data=Integer.toString(a);
        String data2=Float.toString(fr);
        String data3=Double.toString(dr);
        String data4=Long.toString(lr);

        System.out.println("****************");
        System.out.println("int in String="+data);
        System.out.println("*****************");
        System.out.println("float in String="+data2);
        System.out.println("*****************");
        System.out.println("double in String="+data3);
        System.out.println("*****************");
        System.out.println("long in String="+data4);

    }
}
