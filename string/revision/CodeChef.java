package string.revision;

public class CodeChef {
    public static void main(String[] args) {
        String s1="vikash";
        String s2="";
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            s2+=s1.charAt(i);
        }
        for(int i=s1.length()-1;i>=0;i--)
        {
            s3+=s1.charAt(i);
        }
        System.out.println("Name :"+s2);
        System.out.println("Reverse Name :"+s3);
        System.out.println();
        for(int i=0;i<s2.length();i++)
        {
            if(s3.charAt(i)==s1.charAt(i))
            {
                System.out.println(s2.charAt(i));
            }

            else {
                System.out.println("No character is matching.");
            }
        }
        System.out.println(s1.replace('a','e'));
        System.out.println(s1);
    }
}
