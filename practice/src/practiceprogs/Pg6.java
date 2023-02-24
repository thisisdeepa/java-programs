//reversing 1,2,3,4,5 to 5,4,3,2,1
package practiceprogs;


import java.util.Arrays;

public class Pg6 {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        Pg6 p1= new Pg6();
        p1.reverse(arr);
    }

    void reverse(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int back= arr.length-i-1;
            int temp=arr[i];
            arr[i]=arr[back];
            arr[back]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
// tc: O(n)