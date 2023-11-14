package interface_revision;

import java.util.Scanner;
 class Vikash1 implements Client1{
    String enrollment;double percentage;
    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your enrollment please:");
        enrollment=s.nextLine();
        System.out.println("Enter your percentage please:");
        percentage=s.nextDouble();
    }
    public void output()
    {
        System.out.println("Enrollment : "+enrollment+"\n"+"Percentage : "+percentage);
    }
}
