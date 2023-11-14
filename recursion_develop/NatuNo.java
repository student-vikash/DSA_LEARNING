package recursion_develop;

import java.util.Scanner;

public class NatuNo {
    public static void natno(int n)
    {
        if(n>9)
            return;

        System.out.print(n+" ");
        natno(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=s.nextInt();
        natno(n);
    }
}
