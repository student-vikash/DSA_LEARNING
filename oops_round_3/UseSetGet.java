package oops_round_3;

public class UseSetGet
{
    public static void main(String[] args) {
        SetGet s=new SetGet();
        s.setId(3);
        s.setName("Virat");
        s.setSalary(50000);
        System.out.println("Your id no is "+s.getId());
        System.out.println("Your name is "+s.getName());
        System.out.println("Your salary is "+s.getSalary());
    }
}
