package leetcode_series;

import java.util.Scanner;

public class ExcelPro {

    // Excel column method
    public static int excel(String str)
    {
        int result=0;
        int power=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char c=str.charAt(i);
            int val=(int)c-65+1;
            result+=val*Math.pow(26,power);
            power++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string please:");
        String str=s.next();
        System.out.println("Excel column of your string "+str+" is "+excel(str));

    }
}
