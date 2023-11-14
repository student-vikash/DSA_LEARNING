package oops_series;

public class UseConsChain
{
    public static void main(String[] args) {


    ConstChain c1=new ConstChain(4,6,8);
    ConstChain c2=new ConstChain(4);
    ConstChain c3=new ConstChain();

        c1.showData();
        System.out.println();
        c2.showData();
        System.out.println();
        c3.showData();


}}
