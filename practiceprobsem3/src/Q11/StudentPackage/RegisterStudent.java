package Q11.StudentPackage;
import java.util.Scanner;
import Q11.ResultPackage.Result;

class CreditLimit extends Exception
{
    CreditLimit(String s)
    {
        super(s);
    }
}
interface Student
{
    public void getName();
    public void getBranch();
}
public class RegisterStudent extends Result implements Student{
    Scanner sc=new Scanner(System.in);
    @Override
    public void getName() {
        System.out.println("Enter the name");
        name=sc.nextLine();
    }

    @Override
    public void getBranch() {
        System.out.println("Enter the branch");
        branch =sc.nextLine();
    }
    public void register(int sem)
    {
        semester=sem;
        if(semester==1)
        {
            getName();
            getBranch();
        }
        System.out.println("Enter the 6 subjects registered");
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter subjects "+(i+1));
            subjects[i]=sc.next();
        }

        System.out.println("Enter the respective credits");
        totalCredits=0;
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter subjects "+(i+1));
            credit[i]=sc.nextInt();
            totalCredits+=credit[i];
        }
        try
        {
            if(totalCredits>30)
            {
                throw new CreditLimit("Credit Limit Exception");
            }
        }
        catch(CreditLimit ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
