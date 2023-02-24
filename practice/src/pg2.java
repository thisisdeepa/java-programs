public class pg2 {
    public static void main(String args[]) {
        int n=4;
        int[] arr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if (i == 0 || i == 1 || i == 2)
                arr[i] = 1;
            else if (i == 3)
                arr[i] = 2;
            else
                arr[i] = arr[i - 1] + arr[i - 3] + arr[i - 4];

        }

        System.out.println(arr[n]);
    }
}
