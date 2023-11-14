package oops_series;

public class StaticM {
    private static int rollno;
    private static String name;
    public void setdata(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public static void getdata()
    {
        System.out.println("Roll No :"+rollno);
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        StaticM s=new StaticM();
        s.setdata(3,"vikash");// ye static hai to update hoga
        s.setdata(5,"sonu"); // final output update ho k
        StaticM.getdata();

        /* First use of static method

        when we want to access static member using Class name.

         */
    }
}
