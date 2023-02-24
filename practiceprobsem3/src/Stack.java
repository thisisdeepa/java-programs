
import java.util.Scanner;

class Stack {
    final int size=6;
    int top,item;
    int[] s=new int[size];
    Scanner sc =new Scanner(System.in);
    Stack()
    {
        top=-1;
    }

    void push()
    {
        if(top==size-1)
        {
        System.out.println("Stack Overflow");
        }
        else
        {
            System.out.println("Enter the element");
            item=sc.nextInt();
            s[++top]=item;
        }
    }

    void pop()
    {
        int del;
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            del=s[top--];
            System.out.println("Element deleted: "+del);
        }
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack Empty");
        }
        else{
            System.out.println("Elements of the stack are:");
            for(int i=0;i<=top;i++)
                System.out.println(s[i]+" ");
        }
    }

    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int ch;
       Stack mystack =new Stack();
        while(true)
        {
            System.out.println("Enter :\n1:PUSH\n2:POP\n3:DISPLAY");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    mystack.push();
                    break;
                case 2:
                   mystack.pop();
                    break;
                case 3:
                   mystack.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
