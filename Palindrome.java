
import java.util.Scanner;


public class Palindrome 
{
    public static void main(String args[])
    {  
        int r,rev=0,temp;    
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        temp=n;    
        while(n>0)
        {    
            r=n%10;  
            rev=(rev*10)+r;    
            n=n/10;    
        }   
        if(temp==rev)    
            System.out.println(temp+ " is a Palindrome number");    
        else    
            System.out.println(temp+ " is not a Palindrome number"); 
    }  
}
    

