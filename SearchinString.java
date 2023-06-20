
import java.util.Arrays;
import java.util.Scanner;

public class SearchinString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        char ch;
        System.out.println("Enter String: ");
        str=sc.next();
        System.out.println(Arrays.toString(str.toCharArray())); //change to character array
        System.out.println("Enter character to search: ");
        ch=sc.next().charAt(0);
        if(str.length()==0)
        {
            System.out.println("Empty String");
        }
        for(int i=0;i<str.length();i++)
        {
            if(ch == str.charAt(i))
            {
                System.out.println("Character found at index "+i);
            }
        }
    }
}
