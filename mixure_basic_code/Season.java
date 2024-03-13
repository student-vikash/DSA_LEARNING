package mixure_basic_code;

import java.util.Scanner;

public class Season
{
    public static void season(String monthname)
    {
        switch (monthname)
        {
            case "january","february","november","december":
                System.out.println("Please try to visit Coastal region.");break;
            case "march","april","may","june":
                System.out.println("Please try to visit Northern India.");break;
            case "july","august","september","october":
                System.out.println("Try to visit Plateau region");break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the month name please:");
        String monthname=s.nextLine();
        season(monthname);
    }
}
