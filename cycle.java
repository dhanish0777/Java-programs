import java.util.Arrays;
import java.util.Scanner;
public class cycle {
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
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int second)
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}