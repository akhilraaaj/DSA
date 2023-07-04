import java.util.*;

public class spyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int s=0;
        int p=1;
        while(temp>0) {
            int rem=temp%10;
            s=s+rem;
            p=p*rem;
            temp=temp/10;
        }
        System.out.print("\nSum of digits: "+s);
        System.out.println("\nProduct of digits: "+p);
        if(s==p)
            System.out.print(n+ " is a spy number!");
        else
            System.out.print("n+ is not a spy number");
    }
}
