//public class Treenode {
//    public int data;
//    public Treenode left;
//    public Treenode right;
//    public int size = 0;
//
//    public Treenode(int d) {
//        data = d;
//        size = 1;
//    }
//
//
//
//
//    public static Treenode createBt(int val,Treenode ptr)
//    {
//
//        if(ptr==null)
//        {
//            Treenode ptr=new Treenode();
//            ptr.data=val;
//            ptr.left=null;
//            ptr.right=null;
//            return ptr;
//        }
//        else
//        {
//            if(val<ptr.data)
//                ptr.left=createBt(val,ptr.left);
//            else if(val>ptr.data)
//                ptr.right=createBt(val,ptr.right);
//            else
//                System.out.println("Duplicate");
//        }
//        return ptr;
//    }
//
//    public static void preorder(Treenode head)
//    {
//        if(head!=null)
//        {
//            System.out.println(head.data+"->");
//            preorder(head.left);
//            preorder(head.right);
//        }
//    }
//
//    public static void main(String args[])
//
//    {
//        Treenode root=null;
//        int[] array = {8,3,6,4,1,5};
//        for(int i=0;i<array.length;i++)
//        {
//
//            root= createBt(array[i],root);
//        }
//
////        preorder(root);
//    }
//}

