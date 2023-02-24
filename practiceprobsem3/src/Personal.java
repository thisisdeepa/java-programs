
import java.util.Scanner;

public class Personal {
    String name;
    int age;
    String education;
    double basic;
    double da;
    double hra;
    int years_of_experience;
    int no_of_loans;
    double[] loan_amt;

    Personal(String name,int age,String education,double basic,double da,double hra,int years_of_experience,int no_of_loans,double loan_amt[])
    {
        this.name=name;
        this.age=age;
        this.education=education;
        this.basic=basic;
        this.da=da;
        this.hra=hra;
        this.years_of_experience=years_of_experience;
        this.no_of_loans=no_of_loans;
        this.loan_amt=loan_amt;
    }

    void isEligible(Personal p)
    {
        if ((p.basic+p.hra+p.da)>=500000 && p.no_of_loans <=2)
        {
            System.out.println(p.name + " is eligible for loan");
        }
        else
        {
        System.out.println(p.name+" is not eligible for loan");}
    }

    void taxPay(Personal p)
    {
        double sal=p.basic+p.hra+p.da;
        if(sal<=250000)
            System.out.println("No tax to be paid");
        else if(sal<=500000)
            System.out.println("The tax to be paid is: "+0.2*sal);
        else if(sal<=1000000)
            System.out.println("The tax to be paid is: "+0.3*sal);
        else
            System.out.println("The tax to be paid is: "+0.4*sal);
    }

    void isEligiblePromotion(Personal p)
    {
        if(p.years_of_experience>=10  &&  p.age>=45)
            System.out.println(p.name+" is eligible for promotion");
        else
            System.out.println(p.name+" is not eligible for promotion");
    }

    void Display(Personal p) {
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Education: " + p.education);
        System.out.println("Salary: " + (p.basic + p.hra + p.da));
        System.out.println("Years Of Experience: " + p.years_of_experience);
        System.out.println("Number Of Loans: " + p.no_of_loans);
        for (int j = 0; j < p.no_of_loans; j++) {
            System.out.println("Loan Amount " + (j+1) + ": " + p.loan_amt[j]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the number of employees whose details you want to enter");
        n=sc.nextInt();
        sc.nextLine();
        Personal[] p=new Personal[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of employee "+(i+1));

            System.out.println("Enter name");
            String name=sc.nextLine();

            System.out.println("Enter age");
            int age =sc.nextInt();
             sc.nextLine();
            System.out.println("Enter education");
            String edu=sc.nextLine();

            System.out.println("Enter basic salary");
            double basic=sc.nextDouble();

            System.out.println("Enter hra");
            double hra=sc.nextDouble();

            System.out.println("Enter da");
            double da=sc.nextDouble();

            System.out.println("Enter years of experience");
            int years_of_exp =sc.nextInt();

            System.out.println("Enter no of loans");
            int no_of_loans=sc.nextInt();

            double[] loan_amt =new double[no_of_loans];
            for(int j=0;j<no_of_loans;j++) {
                System.out.println("Enter loan amount "+(j+1));
                loan_amt[j] = sc.nextDouble();
            }
            p[i]=new Personal(name,age,edu,basic, da, hra,years_of_exp, no_of_loans,loan_amt);
            p[i].Display(p[i]);
            p[i].isEligible(p[i]);
            p[i].taxPay(p[i]);
            p[i].isEligiblePromotion(p[i]);
        }
    }
}

