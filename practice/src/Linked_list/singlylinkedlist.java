package Linked_list;

public class singlylinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createsll(int val)
    {
        head=new Node();
        Node ptr=new Node();
        ptr.value=val;
        ptr.next=null;
        head=ptr;
        tail=ptr;
        size=1;
        return head;
    }

    public void printsll()
    {
        Node temp=head;
        if(head!=null)
        {
            while(temp!=null)
            {
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
        }
        else
        {
            System.out.println("Empty linked list");
        }
    }

    public Node searchsll(int val)
    {
        int i=1;
        if(head==null)
        {
            System.out.println("Empty ll");
            return null;
        }

        else
        {
            Node temp=head;
            while(temp!=null)
            {
                if (temp.value==val)
                {
                    System.out.println("Value found at"+i+"position");
                    return temp;
                }
                temp=temp.next;
                i++;

            }
        }
        System.out.println("Value not found");
        return null;
    }


    public Node insertsll(int val)
    {
//        Node temp=searchsll(current);
//        if(temp==null)
//        {
//            System.out.println("Value not inserted");
//        }
//        else
//        {
//            Node node=new Node();
//            node.value=val;
//            if(temp==head)
//            {
//
//                System.out.println("Inserting before head node");
//                node.next=temp;
//                head=node;
//                size++;
//            }
//
//            else if (temp==tail){
//                System.out.println("Inserting after tail node");
//                temp.next=node;
//                tail=node;
//                size++;
//            }
//            else
//            {
//                node.next=temp.next;
//                temp.next=node;
//                size++;
//            }
//        }
        Node newnode=new Node();
        newnode.value=val;
        tail.next=newnode;
        newnode.next=null;
        tail=newnode;

        return head;
    }

}
