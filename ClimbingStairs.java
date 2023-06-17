import java.util.*;
public class ClimbingStairs
{
    public static int minimumAverageDifference(int[] nums) 
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
               s=nums[i]+nums[j];
            }
        }    
        return s;
    }
    
    public static void main(String[] args) {
         int[] nums={2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(nums));
    }
}
