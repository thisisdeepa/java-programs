import java.util.Scanner;
public class matrixmul {
       int rows,columns;
       int arr[][];
    Scanner sc =new Scanner(System.in);
       matrixmul(int rows,int columns)
       {
           this.rows=rows;
           this.columns=columns;
           this.arr= new int[rows][columns];
       }
       void getel()
       {
           for(int i=0;i<rows;i++)
           {
               for(int j=0;j<columns;j++)
               {
                   arr[i][j]=sc.nextInt();
               }
           }
       }

       void printmat()
       {
           for(int i=0;i<rows;i++)
           {
               for(int j=0;j<columns;j++)
               {
                   System.out.print(arr[i][j]+" ");
               }
               System.out.print("\n");
           }
       }

       int matrixmultiply(matrixmul m1,matrixmul m2)
       {
           int flag =0;
           if(m1.columns!=m2.rows)
           {
               flag=1;
               return flag;
           }
           else
           {
               for(int i=0;i<m1.rows;i++)
               {
                   for(int j=0;j<m2.columns;j++)
                   {
                       for(int k=0;k<m1.columns;k++)
                       {
                           arr[i][j]+= m1.arr[i][k]*m2.arr[k][j];
                       }
                   }
               }
           }
           return flag;
       }

       public static void main(String[] args)
       {
           Scanner sc =new Scanner(System.in);
           int rows1,rows2,col1,col2;
           System.out.println("Enter the number of rows of matrix 1");
           rows1=sc.nextInt();
           System.out.println("Enter the number of columns of matrix 1");
           col1=sc.nextInt();
           matrixmul m1= new matrixmul(rows1,col1);
           System.out.println("Enter the elements of matrix 1");
           m1.getel();


           System.out.println("Enter the number of rows of matrix 2");
           rows2=sc.nextInt();
           System.out.println("Enter the number of columns of matrix 2");
           col2=sc.nextInt();
           matrixmul m2= new matrixmul(rows2,col2);
           System.out.println("Enter the elements of matrix 1");
           m2.getel();

           System.out.println("1st matrix:");
           m1.printmat();
           System.out.println("2nd matrix:");
           m2.printmat();

           matrixmul m3=new matrixmul(m1.rows,m2.columns);
           int flag= m3.matrixmultiply(m1,m2);
           if(flag==0) {
               System.out.println("The multpilied matrix is:");
               m3.printmat();
           }
           else
           System.out.println("multiplication not possible");
       }
}
