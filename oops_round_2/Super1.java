package oops_round_2;

public class Super1
{
    // method in super class
    public void write()
    {
        System.out.println("Write an Application.");
    }
    public void read()
    {
        System.out.println("Read news paper daily.");
    }
    static class Child extends Super1

    {
        public void yourWork()
        {
            System.out.println("Your extended methods here .");
            super.read();
            super.read();
        }
    }

    public static void main(String[] args) {
        Child ch=new Child();
        ch.yourWork();
    }
}
