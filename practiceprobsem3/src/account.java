import java.util.Scanner;

class account {
    int Accno;
    String name;
    int Phone_No;
    float balance_amt;
    Scanner sc =new Scanner(System.in);
    void getinput()
    {
        System.out.println("Enter the details of the account holder");
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter account number");
        Accno=sc.nextInt();
        System.out.println("Enter MOBILE NUMBER");
        Phone_No=sc.nextInt();
    }

    void Deposit()
    {
        float amm;
        System.out.println("Enter the deposit ammount");
        amm=sc.nextFloat();
        balance_amt=balance_amt+amm;
        System.out.println("Balance:"+balance_amt);
    }

    void Withdraw()
    {
        float amm;
        System.out.println("Enter the ammount to be withdrawn");
        amm=sc.nextFloat();
        if(balance_amt>=amm)
            balance_amt=balance_amt-amm;
        else
            System.out.println("Insufficient balance");

        System.out.println("Balance:"+balance_amt);
    }
    void print()
    {
        System.out.println("NAME: "+name);
        System.out.println("Account Number: "+Accno);
        System.out.println("Mobile Number:"+Phone_No);
        System.out.println("Balance: "+balance_amt);
    }
    public static void main(String args[])
    {

        Scanner sc =new Scanner(System.in);
        int ch;
        account ac= new account();
        ac.getinput();
        while(true)
        {
            System.out.println("Enter:\n1:To Deposit\n2:To Withdraw\n3:Print Details");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    ac.Deposit();
                    break;
                case 2:
                    ac.Withdraw();
                    break;
                case 3:
                    ac.print();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
