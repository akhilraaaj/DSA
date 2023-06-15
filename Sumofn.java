import java.util.Scanner;

public class Sumofn 
{
    public static void main(String args[])
    {
        int n, s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
           
            if(i==n)
            {
                s=s+i;
                System.out.print(i);
            }
            else
            {
                 s=s+i;
                System.out.print(i+" + ");
            }
        }
        System.out.println("\nSum is: "+s);
    }
}