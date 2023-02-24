import java.util.HashMap;

public class pg5 {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(111, 2);
        hm.put(222,3);
        Integer a=hm.get(222);
        System.out.println(a);
        System.out.println(hm);
        System.out.println(hm.toString());
    }


}
