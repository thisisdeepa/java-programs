import java.util.Scanner;

public class fibworecursion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of terms you want to print in the fib series");
        n=sc.nextInt();
        int a=0,b=1,c;
        for(i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
