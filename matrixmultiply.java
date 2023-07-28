import java.util.Scanner;
public class matrixmultiply {
    public static void main(String args[])
    {
        int row1,row2,col1,col2,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of 1st matrix:");
        row1=sc.nextInt();
        System.out.println("Enter the number of columns of 1st matrix:");
        col1=sc.nextInt();
        int[][] mat1=new int[row1][col1];
        System.out.println("Enter the elements of 1st matrix:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of 2nd matrix:");
        row2=sc.nextInt();
        System.out.println("Enter the number of columns of 2nd matrix:");
        col2=sc.nextInt();
        int[][] mat2=new int[row2][col2];
        System.out.println("Enter the elements of 1st matrix:");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The First Matrix is:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Second Matrix is:");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] result=new int[row1][col2];
        for(i=0;i<row1;i++)
        {
            int k=0;
            for(j=0;j<col2;j++)
            {
                for(k=0;k<col2;k++)
                {
                    result[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("The Resultant Matrix is:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
