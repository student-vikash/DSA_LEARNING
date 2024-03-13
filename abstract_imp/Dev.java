package abstract_imp;

public class Dev
{
    String s1=new String("Vikas");
    String s2=s1.concat(" Kumar");
    String s3=s2.concat(" Rana");

    StringBuffer sb=new StringBuffer("Viksh");
    StringBuffer sb2=sb.append(" Kumar");
    StringBuffer sb3=sb.append(" Rana");
}
class DevDriver
{


    public static void main(String[] args) {
        Dev d=new Dev();
        System.out.println(d.s1);
        System.out.println(d.s2);
        System.out.println(d.s3);


        System.out.println(d.sb);
        System.out.println(d.sb2);
        System.out.println(d.sb3);
    }}
