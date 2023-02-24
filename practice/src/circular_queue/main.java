package circular_queue;


import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        circQ cc=new circQ(5);
        int ch;
        while(true)
        {
            System.out.println("Enter 1:Enqueue  2:Dequeue  3:Display  4:Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data");
                    int data=sc.nextInt();
                    cc.enq(data);
                    break;
                case 2:
                    cc.deq();
                    break;
                case 3:
                    cc.disp();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Invalid choice!! re-enter!!!");
                    break;
            }
        }
    }
}
