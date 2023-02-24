// power of a number
// x^n = x * x^n-1
package practiceprogs;

public class Pg2 {
    public static void main(String args[])
    {
        System.out.println("heloooo");
        Pg2 it1=new Pg2();
        int res= it1.f(-2,5);
        System.out.println(res);
    }

    public int f(int n,int p) {
        if (p < 0)
        {
            return -1;
        }
        if(p==0)         //or if n==0 return 0;
        {
            return 1;
        }
        else {
            return n*f(n,p-1);
        }
    }
}
