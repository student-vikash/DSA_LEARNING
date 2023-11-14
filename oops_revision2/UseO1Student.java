package oops_revision2;

public class UseO1Student
{
    public static void main(String[] args) {
        O1Student obj=new O1Student();
        obj.roll=10;
        obj.name="Vikash";
        obj.per=90.40;
        System.out.println("Roll : "+obj.roll);
        System.out.println("Name : "+obj.name);
        System.out.println("Percentage : "+obj.per);
    }
}
