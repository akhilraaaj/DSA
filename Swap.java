
import java.util.Scanner;
public class Swap 
{
  public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.println("Enter value of a: ");
        a=sc.nextInt();
        System.out.println("Enter value of b: ");
        b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The numbers after swapping is..." );
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);
    }
}
