package array_demo;

public class LastOccurance {
    // method to search last occurance
    public static int lastTime(int []ar,int x)
    {
        int last=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                last=i;
        }
        return last;
    }

    public static void main(String[] args) {
        int ar[]={2,5,3,2,9,2,6,2,1,0};
        int x=2;
        System.out.println("Last time element "+x+" is occured at index "+lastTime(ar,x));
    }
    }

