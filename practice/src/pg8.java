public class pg8 {
    public static void main(String args[]) {
//        String a="Hel";
//        String b="Bye";
//        char[] ans= new char[a.length()+b.length()];
//
//        char[] c1=a.toCharArray();
//        char[] c2=b.toCharArray();
//
//        int i=0;
//        int j=0;
//
//        while(i<a.length() || i<b.length())
//        {
//            ans[j++]=a.charAt(i);
//            ans[j++]=c2[i];
//            i++;
//
//        }
//        String res=Arrays.toString(ans);
//        System.out.println(toString(ans));
//    }



            String S1="Hello";
            String S2="Bye";
            int i = 0, j = 0;
            int l1 = S1.length();
            int l2 = S2.length();
            char[] arr = new char[l1 + l2];

            while (i < l1 && i < l2) {
                arr[j++] = S1.charAt(i);
                arr[j++] = S2.charAt(i);
                i++;
            }
            while (i < l1) {
                arr[j++] = S1.charAt(i);
                i++;
            }
            while (i < l2) {
                arr[j++] = S2.charAt(i);
                i++;
            }
        System.out.println(toString(arr));


        }
    private static String toString (char[] ans){
        String str = new String(ans);
        return str;
    }

    }

