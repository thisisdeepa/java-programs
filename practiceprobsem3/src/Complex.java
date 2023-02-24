import java.util.Scanner;

class Complex {
    int r, c;
    Scanner sc=new Scanner(System.in);
    Complex() {
       this.r=0;
       this.c=0;
    }
    void getinput()
    {
        System.out.println("Enter the real part");
        r=sc.nextInt();
        System.out.println("Enter the complex part");
        c=sc.nextInt();
    }

    static Complex add(Complex c1, Complex c2)
    {
        Complex c3=new Complex();
        c3.r=c1.r+c2.r;
        c3.c=c1.c+c2.c;
        return c3;
    }
    static Complex sub(Complex c1, Complex c2)
    {
        Complex c3=new Complex();
        c3.r=c1.r-c2.r;
        c3.c=c1.c-c2.c;
        return c3;
    }
    static Complex mul(Complex c1, Complex c2)
    {
        Complex c3=new Complex();
        c3.r=(c1.r*c2.r)-(c1.c*c2.c);
        c3.c=(c1.r*c2.c)+(c2.r*c1.c);
        return c3;
    }
    public static void main(String args[]) {
        int ch;
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex result=new Complex();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter  1:ADD  2:SUBTRACT  3:MULTIPLY  4:EXIT");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the first complex number");
                    c1.getinput();
                    System.out.println("Enter the first complex number");
                    c2.getinput();
                    result=result.add(c1,c2);
                    System.out.println("The sum of two complex numbers is:"+result.r+" "+"i"+result.c);
                    break;
                case 2:
                    System.out.println("Enter the first complex number");
                    c1.getinput();
                    System.out.println("Enter the first complex number");
                    c2.getinput();
                    result=result.sub(c1,c2);
                    System.out.println("The difference of two complex numbers is:"+result.r+" "+"i"+result.c);
                    break;
                case 3:
                    System.out.println("Enter the first complex number");
                    c1.getinput();
                    System.out.println("Enter the first complex number");
                    c2.getinput();
                    result=result.mul(c1,c2);
                    System.out.println("The product of two complex numbers is:"+result.r+" "+"i"+result.c);
                    break;
                case 4:
                    System.exit(0);

            }

        }
    }
}
