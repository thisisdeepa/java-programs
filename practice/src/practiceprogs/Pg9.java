/*How to find maximum product of two integers in the array where all elements are positive.

        Example

        int[] intArray = {10,20,30,40,50};
        maxProduct(intArray) // (40,50)*/
package practiceprogs;

public class Pg9 {
        public static void main(String args[])
        {
            Pg9 ex= new Pg9();
            int[] arr={25,10,5,60,20};
            String pairs=ex.maxProduct(arr);
            System.out.println(pairs);
        }
        public String maxProduct(int[] intArray) {
            int maxprod=0;
            String p="";
            for(int i=0;i<intArray.length;i++)
            {
                for(int j=i+1;j<intArray.length;j++)
                {
                    if(intArray[i]*intArray[j]>maxprod)
                    {
                        maxprod=intArray[i]*intArray[j];
                        p=Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                    }
                }
            }
            return p;
        }

    }

