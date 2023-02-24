//You are given a read only array of n integers from 1 to n.
//Each integer appears exactly once except A which appears twice and B which is missing.
//Return A and B.
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//Note that in your output A should precede B.
//Example:
// Input:[3 1 2 5 3]
// Output:[3, 4]
//A = 3, B = 4
import java.util.HashMap;
public class pg10 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(final int[] A) {
        int a=0,b=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(hm.containsKey(A[i]))
            {
                a=A[i];
            }
            else
            {
                hm.put(A[i],1);
            }
        }
        for(int i=1;i<=A.length;i++)
        {
            if(hm.containsKey(i))
            {
                b=0;
            }
            else{
                b=i;
                break;
            }
        }

        int[] B=new int[2];
        B[0]=a;
        B[1]=b;
        return B;


    }

    public static void main(String args[])
    {
        int[] A={3,1,2,5,3};
        int[] B= new int[2];
        B=repeatedNumber(A);
        System.out.println(B[0]+","+B[1]);
    }
}
