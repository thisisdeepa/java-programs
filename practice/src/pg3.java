import java.util.Arrays;
import java.util.Collections;

public class pg3 {
//    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//    firstSecond(myArray) // 90 87
    public static void main(String args[]) {
//        ArrayList<Integer> al=new ArrayList<Integer>();
//        al.add(2);
//        al.add(4);
//        int[] arr = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
//        Arrays.sort(arr,Collections.reverseOrder());
//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.print(Arrays.toString(arr));

        Integer arr[] = {84,90, 85, 86, 87, 85, 90, 90, 83, 23, 45, 84, 1, 2, 0};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]+" "+arr[i+1]);
                break;}
        }


    }
}
