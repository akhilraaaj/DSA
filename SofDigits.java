import java.util.Scanner;
public class SofDigits 
{
    public static void main(String args[])	
    {
	int n, r, sum=0;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
        n=sc.nextInt();
	while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n =n/10;
        }
	System.out.println("Sum of digits of is: "+sum);               	  
    }
}
