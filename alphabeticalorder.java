import java.util.*;

public class alphabeticalorder
{
    public static String alphaorder(String str)
    {
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        String res=new String(charArray);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("The String is: "+str);
        System.out.print("String in alphabetical order: "+alphaorder(str));

    }
}
