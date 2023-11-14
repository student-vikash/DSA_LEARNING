package pattern_series2;

public class Hpattern {
    public static void main(String[] args) {
        // for both column
        for(int i=0;i<3;i++)
        {
            System.out.println("*       *");
        }
        // for first row
        for(int i=0;i<5;i++)
        {
            System.out.print("*"+" ");
        }
        // for second column (both)
        System.out.println();
        for(int i=0;i<3;i++)
        {
            System.out.println("*       *");
        }
    }
}
