//numrows=5
//generate pascal's triangle

//        1
//      1   1
//    1   2   1
//  1   3   3   1              (1+2)=3
//1   4   6   4   1             1+3=4, 3+3=6

import java.util.*;
public class pg6 {
    public static void main(String args[])
    {
        List<List<Integer>> arr = new ArrayList<>();
        int num=5;
        int n;
        for(int i=0;i<num;i++)
        {
            List<Integer> arrCol = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {

                if(j==0 || i==j) {
                    arrCol.add(j, 1);
                    System.out.println(j);
                    System.out.println("hi  "+arrCol);
                }
                else {
                    n = (arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
                    arrCol.add(j,n);
                    System.out.println("hey  "+arrCol);
                }
            }
            arr.add(i,arrCol);
            System.out.println(arr);
        }
        System.out.println(arr);
    }

    }
//    List<List<Integer>> arr = new ArrayList<List<Integer>>();
//    List<Integer> arrCol = new ArrayList<Integer>();
//    Scanner scn = new Scanner(System.in);
//for (int i = 0; i < arr.size(); i++) {
//        for(int j = 0; j < arrCol.size(); j++) {
//        int x = scn.nextInt();
//        arrCol.add(j, x);
//        }
//        arr.add(i, arrCol);
//ystem.out.print(arr.get(i).get(j) + " ");
