package practice_q;

public class ComparSt
{
    public static void main(String[] args) {
        String t1="DATA STRUCTURE WITH JAVA";
        String t2="DATA STRUCTURE WITH C++";
        String t3="DATA STRUCTURE WITH JAVA";
        String t4="data structure with c++";
        String t5="data structure with java";

        int o1=t1.compareToIgnoreCase(t2);
        int o2=t1.compareToIgnoreCase(t3);
        int o3=t1.compareToIgnoreCase(t4);
        int o4=t1.compareToIgnoreCase(t5);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);


    }
}
