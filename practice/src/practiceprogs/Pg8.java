//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1]
//
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
package practiceprogs;
import java.util.Arrays;
public class Pg8 {

    public static void main(String args[]) {
        Pg8 sm = new Pg8();
        int[] arr = {2, 7, 11, 13};
        int[] res = sm.twoSum(arr, 9);

        System.out.println(Arrays.toString(res));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target)
                    return new int[]{i+1, j+1};
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}



