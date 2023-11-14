package string.revision;

public class Stest {
    public static void main(String[] args) {
        String sr="vikash";
        System.out.println("length="+sr.length());
        System.out.println(sr.charAt(2));
        String s2="vikash";
        System.out.println(sr.equals(s2));
        System.out.println(sr.equalsIgnoreCase(s2));
        System.out.println(sr==s2);
    }
}
