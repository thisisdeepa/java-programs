package Q11;
import Q11.StudentPackage.RegisterStudent;
import Q11.StudentPackage.CGPA;
public class MainClass {
    public static void main(String args[])
    {
        RegisterStudent s=new RegisterStudent();
        System.out.println("For semester 1");
        s.register(1);
        s.result();
        System.out.println("For semester 2");
        s.register(2);
        s.result();
        System.out.println("For semester 3");
        s.register(3);
        s.result();
        System.out.println("For semester 4");
        s.register(4);
        s.result();
        s.calculateGpa();
    }
}
