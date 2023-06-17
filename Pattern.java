import java.util.Scanner;
public class Pattern 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = scan.nextInt();
        for (int i = 1; i<=n;i++){
          for (int j = i; j<=n; j++) {
             System.out.print(" "); // decreasing
          }
          for (int j = 1; j< i; j++) { // increasing
             System.out.print(" * ");
          }
          for (int j = 1; j<=i; j++) { // increasing
             System.out.print(" * ");
          }
          System.out.println();
       }
       for (int i = 1; i<=n ; i++) {

          for (int j = 1; j<=i; j++) { // increasing
             System.out.print(" ");
          }
          for (int j = i; j< n; j++) { // decreasing
             System.out.print(" * ");
          }
          for (int j = i; j<=n; j++) { // decreasing
             System.out.print(" * ");
          }
          System.out.println();
       } 
}
}