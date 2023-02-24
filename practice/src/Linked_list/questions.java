package Linked_list;

import java.util.HashSet;

//linkedList = 1->2->1->3
//        deleteDups(linkedList)
////Output
//        1->2->3
public class questions {
    public void q1(singlylinkedlist sll)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        Node ptr=sll.head;
        Node prev=sll.head;
        int curval=ptr.value;
        while(ptr!=null)
        {
            curval=ptr.value;

            if(hs.contains(curval))
            {
                prev.next=ptr.next;
                ptr=prev;
            }
            else{
                hs.add(curval);
                prev=ptr;
            }
            ptr=ptr.next;
        }
    }
    public void reversesll(singlylinkedlist sll)
    {
        Node c=null;

        Node a=sll.head.next;
        sll.head.next=null;
            while(a!=null)
            {
                c=a.next;
                a.next=sll.head;
                sll.head=a;
                a=c;
            }
    }
}
