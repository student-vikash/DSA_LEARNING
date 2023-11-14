package stack_revision;

public class UseCodeChef {
    public static void main(String[] args) {
        Codechef s=new Codechef(6);
        int x=10;
        for(int i=1;i<=6;i++)
        {
            s.push(x);
            System.out.println("Pushed Element:"+x);
            x+=10;
        }
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.println("Top Element:"+s.peek());
        System.out.println();
        System.out.println("****************************");
        for(int i=1;i<=6;i++)
        {
            x=s.pop();
            System.out.println("Popped Element:"+x);
        }
    }
}
