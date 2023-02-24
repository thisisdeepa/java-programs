package Linked_list;

public class main {
    public static void main(String args[]) {
        singlylinkedlist sll = new singlylinkedlist();
//        sll.printsll();
//        sll.createsll(50);
//        sll.printsll();
//        sll.searchsll(50);
//        sll.insertsll(40,50);
//        sll.printsll();
//        sll.searchsll(50);
//        sll.insertsll(60,50);
//        sll.printsll();
//        sll.insertsll(44,50);
//        sll.printsll();
//        sll.insertsll(55,44);
//        sll.printsll();
//        sll.insertsll(99,60);
//        sll.printsll();
//        sll.searchsll(55);
//        sll.searchsll(88);
//        sll.insertsll(55,55);
//        sll.printsll();
            sll.createsll(1);
            sll.insertsll(2);
        sll.insertsll(3);
//        sll.insertsll(3);
//        sll.insertsll(3);
//        sll.insertsll(3);
        sll.insertsll(4);
        sll.insertsll(5);
        sll.insertsll(6);
//        sll.printsll();
        questions qq=new questions();
//        qq.q1(sll);
        System.out.println(sll.head.value);
        sll.printsll();
        System.out.println();
        qq.reversesll(sll);
        sll.printsll();


    }
}
