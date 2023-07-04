import java.util.*;

public class oddnoEnding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++) {
            if(i%10==1 || i%10==4 || i%10==9)
                System.out.print(i+" ");
        }
    }
}
