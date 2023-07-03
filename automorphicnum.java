
import java.util.*;
public class automorphicnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        int n1=n%10;
        int sq=(int)Math.pow(n,2);
        System.out.println(sq);
        int rem=sq%10;
        if(n1==rem)
            System.out.print("Automorphic");
        else
            System.out.print("Not automorphic");
    }
}
