import java.util.*;

public class handshake
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int res=n*(n-1)/2;
        System.out.print("Total no. of handshakes: "+res);
    }
}
