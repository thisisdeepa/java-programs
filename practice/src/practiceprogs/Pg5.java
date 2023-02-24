//sum and product of elements in an array
package practiceprogs;

import java.util.Scanner;

public class Pg5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        int []arr =new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Pg5 obj= new Pg5();
        obj.func(arr,n);




    }

    void func(int arr[],int n)
    {
        int sum=0, product=1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
