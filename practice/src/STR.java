//program to check if a one tree is a subtree of the main tree

//class Solution {
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        //if either tree exhausted. answer not possible
//        if(root==null || subRoot==null) {
//            return false;
//        }
//        //if value same, try comparing entire subtree
//        if(root.val==subRoot.val && check(root,subRoot)) {
//            //if entire tree same return true
//            return true;
//        }
//        //try to check match for left or right of subtree
//        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
//    }
//    private boolean check(TreeNode root, TreeNode subRoot) {
//        //if both end node reached. return true
//        if(root==null && subRoot==null) {
//            return true;
//        }
//        //if either nodes exhaust, or values are different. return false
//        if(root==null || subRoot==null || root.val!=subRoot.val) {
//            return false;
//        }
//        //check again for left and right
//        return check(root.left,subRoot.left) && check(root.right,subRoot.right);
//    }
//}