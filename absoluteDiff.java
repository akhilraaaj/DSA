import java.util.*;

public class absoluteDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int len = (int) (Math.log10(n) + 1);
        int s1=0, s2=0;
        char[] digits = String.valueOf(n).toCharArray();
        System.out.println(digits+ " ");
        for(int i=0;i<digits.length;i++) {
            if(i%2==0)
                s1=Math.abs(s1-digits[i]);
            else
                s2=Math.abs(s2-digits[i]);
        }
        System.out.println(digits.length);
        System.out.print("\nEven difference: "+s1);
        System.out.print("\nOdd difference: "+s2);
    }
}
