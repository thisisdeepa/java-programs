package circular_queue;

public class circQ {
    int[] que;
    int size;
    int rear;
    int front;

    public circQ(int size)
    {
        this.que=new int[size];
        this.size=size;
        this.rear=-1;
        this.front=0;
    }

    public void enq(int data)
    {
        if ((front==0 && rear==size-1) || (rear+1==front)) {
            System.out.println("Queue is full");
            return;
        }
        que[++rear]=data;
        if(rear==size-1 && rear+1!=front)
        {
            rear=-1;
            front =0;
        }

    }

    public void deq()
    {
        if((rear==-1 && front==0) || (rear+1==front))
        {
            System.out.println("Queue is empty!");
            return;
        }


    }

    public void disp()
    {

    }
}
