package oops_series;

class Emp{
    private int age;
    private String name;
    private static String company = "Amazon";

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getdata() {
        System.out.println("Age : " + age + " , " + "Name : " + name + " , " + "Company Name : " + company);
    }
}
public class Static2 {
    public static void main(String[] args) {
        Emp o1=new Emp(18,"vikash");
        Emp o2=new Emp(19,"Sumit");
        Emp o3=new Emp(20,"Sachin");

        o1.getdata();
        o2.getdata();
        o3.getdata();
    }
}
