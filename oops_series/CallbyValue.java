package oops_series;

class Call {
    public  void increament(int x, int y) // formal argument/parameter
    {
        x = x + 5;
        y = y + 5;
    }
}
public class CallbyValue {
    public static void main(String[] args) {
        int x=10;int y=20;
        System.out.println("Before increament x="+x+" y="+y);

        Call c=new Call();

        c.increament(x,y); // actual argument/argument
        System.out.println("After increament x="+x+" y="+y);


    }
}

/* CALL BY VALUE :- when we will change formal argument data and it will not change the
                    actual argument value then it is known as CALL BY VALUE.  */