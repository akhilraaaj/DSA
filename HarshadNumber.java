import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int s=0;
        int temp=n;
        while(temp>0) {
            int rem=n%10;
            s=s+rem;
            temp=temp/10;
        }
        if(n%s==0)
            System.out.println("The number is a Harshad number!");
        else
            System.out.println("The number is not a Harshad number!");
    }

}
