package string.revision;

public class StringByte2 {
    public static void main(String[] args) {
        byte []b={67,68,97,74,86};
        String str=new String(b);
        System.out.println(str);
        System.out.println("***********");
        String str2=new String(b,0,5);
        System.out.println(str2);

    }
}
