package stack_learning;

public class UseStackA {
    public static void main(String[] args) {
        StackA s=new StackA(6);
        int x=5;
        System.out.println("***********************");
        for(int i=1;i<=6;i++)
        {
            s.push(x);
            System.out.println("Pushed element="+x);
            x+=5;
        }
        System.out.println("**********************");
        System.out.println("Top element="+s.peek());
        System.out.println("**********************");
        for(int i=1;i<=6;i++)
        {
            x=s.pop();
            System.out.println("Popped element="+x);
        }
    }
}
