
import java.util.*;

public class distinctelements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        System.out.print("Enter array length: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+i+" :");
            nums[i]=sc.nextInt();
        }
        System.out.println("The given array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        System.out.println();
        System.out.println(nums.length-count);
    }
}
