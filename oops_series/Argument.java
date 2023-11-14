package oops_series;

class Argu
{
    public int add(int a,int b)  // Formal argument/parameter    It will receive the value here
    {
        return a+b;
    }
}
public class Argument {
    public static void main(String[] args) {
        Argu ar=new Argu();
        ar.add(10,20); // Actual argument/argument        It will pass the value from here
    }
}
