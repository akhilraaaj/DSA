import java.util.*;
public class uniqueNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        String st=Integer.toString(n);
        for(int i=0;i<st.length()-1;i++) {
            for(int j=i+1;j<st.length();j++) {
                if(st.charAt(i)==st.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if(count==0)
            System.out.println(n+" is a unique number!");
        else
            System.out.println(n+" is not a unique number!");

    }
}

