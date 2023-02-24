import java.util.Scanner;

 class fibrec {
    static int a=0,b=1,c;
    static void fibr(int n)
    {
        while(n>0)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            n--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in fib series");
        int n=sc.nextInt();
        System.out.print(a+" "+b);
        fibr(n-2);
    }
}
