

public class pg1 {
    public static void main(String args[])
    {
        pg1 it1=new pg1();
        int res= it1.sumofdig(543);
        System.out.println(res);
    }

    public int sumofdig(int n)
    {
        if(n/10==0)
        {
            return n;
        }
        else {
            return (n % 10 + sumofdig(n / 10));
        }
    }
}
