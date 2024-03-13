package oops_round_2;

public class UseDataMember
{
    public static void main(String[] args) {
        DataMember dm=new DataMember();
        dm.id=1;
        dm.name="Sumit";
        dm.per=96.07;
        System.out.println("Id is "+dm.id);
        System.out.println("Name is "+dm.name);
        System.out.println("Percentage is "+dm.per);
    }
}
