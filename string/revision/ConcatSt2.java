package string.revision;

public class ConcatSt2 {
    public static void main(String[] args) {
        String s1=new String("Vikash ");
        String s2=s1.concat("Software ");
        String s3=s2.concat("Solution");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4="Vikash ".concat("Kumar ").concat("Rana");
        System.out.println(s4);
    }
}
