import java.util.Scanner;
class bubsort {
    static void bubsort(int arr[], int n)
    {
        int temp;
        for(int k=0;k<n;k++)
        {
            for(int j=0;j<n-k-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted");
        int i;
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before bubble sort:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        bubsort(arr,n);
        System.out.println("After bubble sort:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
