public class pg4 {
    public static int removeDuplicates(int[] arr) {
        int j = 0;
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr[j++] = arr[i];
                }

        }
        arr[j++]=arr[n-1];
        return j;

    }
    public static void main(String args[])
    {
        int[] arr={1,1,2,3,4,5,6,6,7,8,8,9};
        int k=removeDuplicates(arr);
        for(int i=0;i<k;i++)
        {
            System.out.println(arr[i]);
        }
    }

}

