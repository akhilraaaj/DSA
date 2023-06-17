import java.util.Scanner;
class Details
{
    int empid, bp, bonus, salary;
    String name;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter Employee ID: ");
        empid=sc.nextInt();
        System.out.println("Enter Employee Name: ");
        name=sc.next();
        sc.nextLine();
        System.out.println("Enter Basic Pay: ");
        bp=sc.nextInt();
        System.out.println("Enter Bonus: ");
        bonus=sc.nextInt();
    }
    public int cal()
    {
            int sal=bp+bonus;
            return sal;
    }
    public void output()
    {
        salary=cal();
        System.out.println("Employee Id: "+ empid);
        System.out.println("Employee Name: "+ name);
        System.out.println("Basic Pay: "+ bp);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Salary: "+ salary);
    }
}
public class Employee 
{
    public static void main(String args[])
    {
        Details emp=new Details();
        System.out.println("Enter Employee Details...\n");
        emp.input();
        System.out.println("Final Employee Details...\n");
        emp.output();   
    }           
}
