package wrapper_class_re;

public class Wrapper5 {
    public static void main(String[] args) {
        String str="100";
        Integer in=Integer.valueOf(str);

        Float fr=Float.valueOf(str);
        Double dr=Double.valueOf(str);
        Long lr=Long.valueOf(str);
        Character ch=Character.valueOf('@');
        System.out.println("String in int="+in);

        System.out.println("String in float="+fr);

        System.out.println("String in double="+dr);

        System.out.println("String in long="+lr);

    }
}
