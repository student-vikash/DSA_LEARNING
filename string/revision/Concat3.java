package string.revision;

public class Concat3 {
    public static void main(String[] args) {
        String s1=new String("You ");
        System.out.println(s1);
        System.out.println();
        s1=s1.concat("are ");
        System.out.println(s1);
        System.out.println();
        s1=s1.concat("lucky ");
        System.out.println(s1);
        System.out.println();
        s1=s1.concat("man");
        System.out.println(s1);

        System.out.println();
        String s2="Vikash ".concat("Kumar ").concat("Rana");
        System.out.println(s2);
    }
}
