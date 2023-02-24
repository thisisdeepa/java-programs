//calculate avg temperature and check how many days temp are above avg
package practiceprogs;
import java.util.Scanner;

public class Pg7 {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Pg7 temp=new Pg7();
        temp.cal_temp();;
    }
    public void cal_temp()
    {
        System.out.println("Enter the number of days");
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Day"+(i+1)+ "'s temp:");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float avg=sum/n;
        System.out.println("The avg is:"+avg);
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                c++;
            }
        }

        System.out.println(c+"days temperature are above avg");


    }
}
