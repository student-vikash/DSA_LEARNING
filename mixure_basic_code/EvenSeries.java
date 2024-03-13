package mixure_basic_code;

import java.util.Scanner;

public class EvenSeries
{
    public static void evenSeries(int start,int end)
    {
        for(int i=start;i<=end;i+=2)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your range please;");
        int start=s.nextInt();
        int end=s.nextInt();
        evenSeries(start,end);
    }
}
