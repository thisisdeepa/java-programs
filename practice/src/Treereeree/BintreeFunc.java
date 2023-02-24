package Treereeree;

import java.util.Scanner;

public class BintreeFunc {
    Scanner sc =new Scanner(System.in);
        public BinTree createbt()
        {
            System.out.println("Enter the value");
            int val=sc.nextInt();
            if(val==-1)
                return null;
            BinTree ptr=new BinTree();
            ptr.st=val;
            System.out.println("Enter the left child node of "+val);
            ptr.left=createbt();
            System.out.println("Enter the right child node of "+val);
            ptr.right=createbt();
            return ptr;
        }

        public void preorder(BinTree ptr)
        {
            if(ptr!=null) {
                System.out.print(ptr.st + "\t");
                preorder(ptr.left);
                preorder(ptr.right);
            }

        }
        int count=0;

        public void func(BinTree temp,int low,int high,int c)
        {
            c++;
            if(temp!=null)
            {
                if(temp.st>low && temp.st<high)
                {
                    if(c!=1)
                    count++;
                }
                func(temp.left,low,high,c);
                func(temp.right,low,high,c);
            }
            System.out.println(count);
        }
}
//morris traversal converting tree into linkedlist by preorder, best logic ever found
// class Solution {
//    public void flatten(TreeNode root) {
//        TreeNode curr = root;
//        while (curr != null) {
//            if (curr.left != null) {
//                TreeNode runner = curr.left;
//                while (runner.right != null) runner = runner.right;
//                runner.right = curr.right;
//                curr.right = curr.left;
//                curr.left = null;
//            }
//            curr = curr.right;
//        }
//    }
//}
