package pattern_series2;

public class Ipattern {
    public static void main(String[] args) {
        // for first row
        for(int i=0;i<5;i++)
        {
            System.out.print("*"+" ");
        }
        // for column
        System.out.println();
        for(int i=0;i<6;i++)
        {
            System.out.println("    *");
        }
        // for second row
        for(int i=0;i<5;i++)
        {
            System.out.print("*"+" ");
        }
    }
}
