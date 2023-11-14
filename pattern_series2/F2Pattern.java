package pattern_series2;

public class F2Pattern {
    public static void main(String[] args) {
        // for row
        for(int i=0;i<5;i++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        // for column
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
        // for second row
        for(int i=0;i<5;i++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        // for second column
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
    }
}
