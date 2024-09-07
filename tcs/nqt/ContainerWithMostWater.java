package tcs.nqt;

public class ContainerWithMostWater
{
    // method to finding container with most water
    public static int containerWithMostWater(int [] height)
    {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while( left < right )
        {
            // calculate the width
            int width = right - left;
            // calculate height of two lines ( minimum )
            int h = Math.min(left,right);
            // calculate container area
            int area = width * h;
            // update maxArea of the container
            maxArea = Math.max(maxArea,area);

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        // finally return the maxContainer
        return maxArea;
    }
    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int solution = containerWithMostWater(height);


        System.out.println("Maximum water that can be held: " + solution);
    }
}
