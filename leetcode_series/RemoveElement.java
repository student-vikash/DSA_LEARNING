package leetcode_series;

import java.awt.desktop.PreferencesEvent;

public class RemoveElement {
    // Method to remove element from the array
    public static int remove(int []ar,int val)
    {
        int index=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=val)
            {
                ar[index]=ar[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int ar[]={4,3,5,4,6};
        System.out.println("Total remained elements = "+ remove(ar,4));
    }
}
