package code_compete2;

public class ArrayEqualorNot {
    public static void main(String[] args) {
        int []x={1,2,3,4,5,6};
        int []y={1,2,3,4,5,6};


        boolean status=true;

        if(x.length==y.length)
        {
            for(int i=0;i<x.length;i++)
            {
                if(x[i]!=y[i])
                    status=false;
            }
        }
        else {
            status=false;
        }
        if(status=false)
        {
            System.out.println("Arrays are not equal");
        }
        else {
            System.out.println("Arrays are equal");
        }
    }
}



        /*   Second approach

        boolean status=Arrays.equals(x,y);
        if(status==true)
        {
        System.out.println("Arrays are equal");
        }
        else
        {
        System.out.println("Arrays are not equal");
        }
         */