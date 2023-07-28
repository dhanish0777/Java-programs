import java.util.Scanner;
public class missingnum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<num)
        {
            int correct=arr[i];
        }
    }
}
