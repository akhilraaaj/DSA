import java.util.Scanner;
public class Prime 
{
    public static void main(String args[])
    {       
        int n, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println(n+ " is a Prime number!!");
        else
            System.out.println(n+ " is not a Prime number!!"); 
    }
}    


