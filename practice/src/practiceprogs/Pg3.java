package practiceprogs;
import java.util.Scanner;

public class Pg3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the decimal");
        n=sc.nextInt();
        Pg3 pp=new Pg3();
        int d=pp.func(n);
        System.out.println(d);


    }

    int func(int n)
    {
        if (n==0)
            return 0;
        else
            return ((n%2)+(10 * func(n/2)));
    }
}
