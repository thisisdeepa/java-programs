import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class LL1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> LL = new LinkedList<String>();
        while (true) {
            System.out.println("1:Insert");
            System.out.println("2:Remove");
            System.out.println("3:List names length less than 5");
            System.out.println("4:Display");
            System.out.println("5:EXIT!!");

            System.out.println("Enter you choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the string you wanna insert");
                    String x = sc.next();
                    LL.add(x);
                    System.out.println("Element inserted successfully!!");
                    break;
                case 2:
                    if (LL.peek() == null) {
                        System.out.println("List is empty");
                    } else {
                        System.out.println("Enter the index to remove");
                        int p = sc.nextInt();
                        System.out.println("The element removed is " + LL.remove(p-1));
                    }
                    break;
                case 3:
                    if (LL.peek() == null) {
                        System.out.println("List is empty");
                    } else {
                        Iterator<String> itr = LL.iterator();
                        String e1 = "";
                        System.out.println("The strings with length less than 5:");
                        while (itr.hasNext()) {
                            e1 = itr.next();
                            if (e1.length() < 5) {
                                System.out.println(e1);
                            }
                        }
                    }

                    break;
                case 4:
                    if (LL.peek() == null) {
                        System.out.println("List is empty");
                    } else {
                        Iterator<String> itr = LL.iterator();
                        System.out.println("The elements are:");
                          while (itr.hasNext()) {
                            System.out.println(itr.next());

                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

