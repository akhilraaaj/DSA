
import java.sql.SQLOutput;
import java.util.*;

public class anagram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1=sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2=sc.nextLine();
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()==s2.length())
        {
            char[] chars1=s1.toCharArray();
            char[] chars2=s2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            boolean result=Arrays.equals(chars1, chars2);
            if(result)
                System.out.println("They are anagram");
            else
                System.out.println("They are not anagram");
        }
    }

}
