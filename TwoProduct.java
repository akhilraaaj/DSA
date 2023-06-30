import java.util.*;

public class TwoProduct {
    public static void findSubset(int[] arr, int target) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]*arr[j]==target){
                    System.out.printf("Pair found (%d, %d)", arr[i], arr[j]);
                    return;
                }
            }
        }
        System.out.print("Pair not found!!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements...");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are...");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter target: ");
        int target=sc.nextInt();
        findSubset(arr, target);
    }
}
