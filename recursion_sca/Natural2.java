package recursion_sca;

import vikash_linkedlist.Node;

public class Natural2 {
    public static void Natural(int n)
    {
        if(n==0)
        {
            return;
        }

//        System.out.println(n);  // 5 4 3 2 1
        Natural(n-1);
        System.out.println(n);   // 1 2 3 4 5
    }

    public static void main(String[] args) {
        int n=5;
        Natural(n);
    }
}
