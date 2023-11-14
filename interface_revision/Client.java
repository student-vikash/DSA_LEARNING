package interface_revision;

import java.util.Scanner;

interface Client {
    void input();
    void output();
}
 class Vikash implements Client
{
    String name;double salary;
   public void input()
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter your name please:");
       name=s.nextLine();
       System.out.println("Enter your salary please:");
       salary=s.nextDouble();
   }
   public void output()
   {

       System.out.println(name+"\n"+salary);
   }

    public static void main(String[] args) {
       String name;double salary;
        Client c=new Vikash();
        c.input();
        c.output();
    }
    }