import java.util.Scanner;
public class maxarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int i;
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The largest element in the array is "+max);
    }
}
