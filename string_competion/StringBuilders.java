package string_competion;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("rikash");
        System.out.println(sb);
        System.out.println();

        // To print character at any index same method,   charAt()

        System.out.println("Character at index 4:  "+sb.charAt(4));
        System.out.println();

        // To change charater at any index in the CONTEND we use METHOD  setCharAt() or insert()

        sb.setCharAt(0,'v');
        System.out.println(sb);
        System.out.println("Some characters :"+sb.substring(3));
        System.out.println();

        sb.insert(6,' ');
        sb.insert(7,'k');
        System.out.println(sb);


        // To delete some characters b/w them we use method delete()

        sb.delete(6,8);
        System.out.println(sb);

        // using of append()

        sb.append(" kumar");
        sb.append(" rana");
        System.out.println(sb);
        System.out.println("Total length= "+sb.length());
    }
}
