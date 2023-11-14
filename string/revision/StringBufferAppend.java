package string.revision;

public class StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Vikash ");
        StringBuffer s2=s1.append("Software ");
        StringBuffer s3=s2.append("Solution");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
