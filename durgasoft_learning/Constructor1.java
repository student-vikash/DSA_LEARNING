package durgasoft_learning;

public class Constructor1 {
    private int id;
    private String name;
    public Constructor1(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void showdata()
    {
        System.out.println("Id No: "+id+"\n"+"Name: "+name);
    }

    public static void main(String[] args) {
        Constructor1 c=new Constructor1(1,"Amit");
        c.showdata();
    }
}
