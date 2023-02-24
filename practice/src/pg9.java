//Input:
//        S = zxvczbtxyzvy
//        Output: c
//        Explanation: In the given string, 'c' is
//        the character which is non-repeating.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class pg9 {
    public static void main(String args[])
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> arr= new ArrayList<>();
        String S="zxhvczbtxyzvy";
        int n=0;
        char ch;

        for(int i=0;i<S.length();i++)
        {
            ch=S.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.remove(ch);
            }
            else {
                hm.put(ch, 1);
                arr.add(ch);
            }
        }
        System.out.println(hm);
        System.out.println(arr.get(0));
//        Iterator<Character> iterator = hm.keySet().iterator();
//
//        Character key = null;
//        if(iterator.hasNext()){
//            key = iterator.next();
//        }
//
//        System.out.println("Key: " + key);
        Map.Entry<Character, Integer> firstEntry = null;
        firstEntry = hm.entrySet().stream().findFirst().get();
        System.out.println(firstEntry);

    }
}
