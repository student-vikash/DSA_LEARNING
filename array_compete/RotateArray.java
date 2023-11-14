package array_compete;

public class RotateArray {

    // method for reverse element present at first and last indices
    public static void reverse(int nums[],int start,int end)
    {
        while(start<end) {
            // Swap elements at first & last index
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    // method to rotate the array
    public static void rotate(int []nums,int k)
    {
        // is k within the array or not
        k %=nums.length;
        // reverse entire array
        reverse(nums,0,nums.length-1);
        // reverse k elements
        reverse(nums,0,k-1);
        // reverse remaining k elements
        reverse(nums,k,nums.length-1);
    }
    // method for printing elements
    public static void printelements(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        System.out.println("Before rotate elements are ");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        rotate(nums,3);
        reverse(nums,0,nums.length-1);

        System.out.println("These are rotated elements in array ");
        printelements(nums);
    }
}
