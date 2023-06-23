import java.util.*;

public class arraysum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int target;
        int n;
        System.out.print("Enter no. of elements in array: ");
        n=sc.nextInt();
        System.out.print("Enter the array elements: \n");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+i+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter target: ");
        target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
