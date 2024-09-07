package accenture_code;

public class StringCompression
{

        // method to compress STRING
    public static String compressString(String str)
    {
        if(str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else {
                compressed.append(str.charAt(i-1));
                compressed.append(count);
                count=1;
            }
        }

        compressed.append(str.charAt(str.length()-1)).append(count);

        return compressed.toString();
    }
    public static void main(String[] args) {
        String ans = compressString("aaaabbbccd");
        System.out.println("Compressed String is : "+ans);
    }
}
