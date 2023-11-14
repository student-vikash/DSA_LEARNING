package queue_ar_imp;

public class UseQueue {
    public static void main(String[] args) {
        Queue p=new Queue(5);
        int x=5;
        System.out.println("*************************");
        System.out.println();
        for(int i=1;i<=5;i++) {
            p.insert(x);
            System.out.println("Inserted element=" + x);
            x+=10;
        }

            System.out.println();
            System.out.println("***************************");
            System.out.println();
            System.out.println("Top element="+p.peek());
            System.out.println();

            System.out.println("****************************");
            System.out.println();
            for(int i=1;i<=5;i++)
            {
                x=p.delete();
            System.out.println("Deleted element="+x);
        }
    }
}
