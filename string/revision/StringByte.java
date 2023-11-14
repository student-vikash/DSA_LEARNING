package string.revision;

public class StringByte {
    public static void main(String[] args) {
        byte []b={65,66,67,68,69};
        String str=new String(b);
        System.out.println(str);
        System.out.println("**************");
        String str2=new String(b,2,3);  // offset = Starting index , length=Apko jitna character chahiye.
        System.out.println(str2);
    }
}
