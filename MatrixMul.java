import java.util.Scanner;
public class MatrixMul 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1, r2, c1, c2;
        System.out.println("Enter no. of rows in Matrix A: ");
        r1=sc.nextInt();
        System.out.println("Enter no. of columns in Matrix A: ");
        c1=sc.nextInt();
        System.out.println("Enter no. of rows in Matrix B: ");
        r2=sc.nextInt();
        System.out.println("Enter no. of columns in Matrix B: ");
        c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        if(c1!=r2)
            System.out.println("Matrix Multiplication not possible!!");
        else
        {
            System.out.println("Enter values of Matrix A: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                    a[i][j]=sc.nextInt();
            }
            System.out.println("Enter values of Matrix B: ");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                    b[i][j]=sc.nextInt();
            }
            System.out.println("Matrix Multiplication is...\n");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                        c[i][j]+=a[i][k]*b[k][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();  
            }
        }
    }
}
        
 
    

