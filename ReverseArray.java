import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int arr[]= new int[10];
        int []rev_arr = new int[10];
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter element "+i+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are...");
        System.out.print("[");
        for(int i=1;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.print("]");
//        System.out.print(Arrays.toString(arr));
        int max=arr[0];
        for(int i=2;i<=n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("\nMaximum value of Array is: "+max);
        System.out.println("\nThe Reverse Array is..");
        System.out.print("[");
        for(int i=n;i>=1;i--)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.print("]");
    }
}
