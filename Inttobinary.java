
import java.util.*;

public class Inttobinary 
{
    public static void main(String args[])
    {
        int n;
        String binary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        binary=Integer.toBinaryString(n);
        System.out.println("Binary number of "+n+ " is: "+binary);
    }
}
