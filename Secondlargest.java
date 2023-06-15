
import java.util.*;

public class Secondlargest 
{
    public static void main(String args[])
    {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("The second largest element is: "+arr[n-2]);
    }
}
