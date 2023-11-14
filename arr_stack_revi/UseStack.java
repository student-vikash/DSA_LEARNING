package arr_stack_revi;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(6);
        int x=10;
        for(int i=0;i<6;i++)
        {
            s.push(x);
            System.out.println("Pushed element is "+x);
            x+=10;
        }

        System.out.println("Top element is "+s.peek());

        for(int i=0;i<6;i++)
        {
             x=s.pop();
            System.out.println("Popped element is "+x);
        }
    }
}
