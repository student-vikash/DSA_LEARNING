package string.revision;

public class StringChar1 {
    public static void main(String[] args) {
        char []ch={'A','B','C','D','E'};
        String str=new String(ch);
        System.out.println(str);
        System.out.println("*****************");
        String str2=new String(ch,0,4);
        System.out.println(str2);
    }
}
