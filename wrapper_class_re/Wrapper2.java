package wrapper_class_re;

public class Wrapper2 {
    public static void main(String[] args) {
        int a=10;
        Float ft=Float.valueOf(a);

        System.out.println("a="+a+" , "+"a="+ft);

        Character ch=Character.valueOf('a');

        System.out.println("Character="+ch);

        Integer in=(int)Integer.valueOf((int)23.343);

        System.out.println("Integer="+in);

        Double dr=Double.valueOf(3443.23f);

        System.out.println("Double="+dr);

        Float fr=Float.valueOf((float)34.3);

        System.out.println("Float ="+fr);
    }
}
