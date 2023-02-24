//kadanes algorithm
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class pg7 {
    public static void main(String args[])
    {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
                int x = 0,y=0;

        int n=nums.length;
        int min=Integer.MIN_VALUE,sum=0;
        int i=0,j=0;

        while(j<n)
        {
            sum=sum+nums[j++];
            if(sum>min)
            {
                min=sum;
                System.out.println(min);
            }
            if(j==n && i<n)
            {
                i=i+1;
                j=i;
                sum=0;
            }
        }
        System.out.println(min);

//        int n=nums.length;
//        int min=0,sum=0;
//        for(int i=0;i<n;i++)
//        {
//            if(nums[i]<min)
//                min=nums[i];
//        }
//        System.out.println(min);
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                sum=0;
//                for(int k=i;k<=j;k++)
//                {
//                    sum=sum+nums[k];
//                }
//                if(sum>min)
//                {
//                    min=sum;
//                    x=i;
//                    y=j;
//                }
//            }
//        }
//        System.out.println(min);
//       for(int a=x;a<=y;a++)
//       {
//           System.out.print(nums[a]+" ");
//       }
    }
}
