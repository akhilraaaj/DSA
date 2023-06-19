
import java.util.Scanner;
public class CtoF 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float c, f;
        System.out.println("Enter temp. in Celcius: ");
        c=sc.nextInt();
        f=(float)(1.8*c+32);
        System.out.println("Temperatture in Fahrenheit: " +f);
    }
}
