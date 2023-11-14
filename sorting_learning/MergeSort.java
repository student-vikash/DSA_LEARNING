package sorting_learning;

public class MergeSort {
    public static void divide(int ar[],int si,int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(ar, si, mid);
        divide(ar, mid + 1, ei);
        conquer(ar,si,mid,ei);
    }

    public static void conquer(int ar[],int si,int mid,int ei)
    {
        int merge[]=new int[ei-si+1];
        int indx1=si; //  will point first comparing arr
        int indx2=mid+1;
        int x=0;
        while (indx1<=mid && indx2 <=ei)
        {
            if(ar[indx1]<= ar[indx2])
            {
                merge[x++]=ar[indx2];
            }
            else {
                merge[x++]=ar[indx2++];
            }
        }
        while (indx1 <=mid)
        {
            merge[x++]=ar[indx1++];
        }
        while (indx2 <=ei)
        {
            merge[x++]=ar[indx2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++)
        {
            ar[j]=merge[i];
        }
    }
}
