
import java.util.*;

public class noofoccurence
{
    public static void main(String argss[])
    {
        Scanner sc=new Scanner(System.in);
        int n, occ, count=0;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        System.out.println("Enter the number to search: ");
        occ=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int rem=n%10;
            if(rem==occ)
                count++;
            n=n/10;
        }
        System.out.println("The no. of occurences of "+occ+ " is: "+count);
    }

    
}
