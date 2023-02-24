//sum of digits of a number
package practiceprogs;

public class Pg1 {
    public static void main(String args[])
    {
        System.out.println("heloooo");
        Pg1 it1=new Pg1();
        int res= it1.sumofdig(663);
        System.out.println(res);
    }

    public int sumofdig(int n)
    {
        if(n/10==0)         //or if n==0 return 0;
        {
            return n;
        }
        else {
            return (n % 10 + sumofdig(n / 10));
        }
    }
}

