package Treereeree;

public class mainclass {
    public static void main(String args[])
    {
        BintreeFunc bc=new BintreeFunc();
        BinTree root=bc.createbt();
        bc.preorder(root);
        bc.func(root,2,7,0);
    }
}
