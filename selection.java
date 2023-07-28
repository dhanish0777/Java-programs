import java.util.Arrays;
import java.util.Scanner;

import javax.swing.LayoutStyle;
public class selection {
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
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<num;i++)
        {
            int last=num-1-i;
            int max=getmax(arr,0,last);
            System.out.println(arr[max]);
            swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int getmax(int[] arr,int start,int end)
    {
        int i;
        int max=start;
        for(i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int max,int last)
    {
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    
}
