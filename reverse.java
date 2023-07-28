import java.util.Arrays;
import java.util.Scanner;
public class reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int i;
        int temp;
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
