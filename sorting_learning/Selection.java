package sorting_learning;

public class Selection {
    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
       int ar[]={7,8,3,1,2};
       for(int i=0;i<ar.length-1;i++)
       {     int smallest=i;
           for(int j=i+1;j<ar.length;j++)
           {
               if(ar[smallest]>ar[j])
               {
                   smallest=j;
               }
               }
           int temp=ar[smallest];
           ar[smallest]=ar[i];
           ar[i]=temp;
           }
       printArray(ar);
       }
    }
