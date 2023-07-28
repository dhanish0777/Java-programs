import java.util.Arrays;
import java.util.Scanner;
public class insertion {
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
        int i,j;
        for(i=0;i<num-1;i++)
        {
            j=i+1;
            while(j>0)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j-1,j);
                    j=j-1;
                }
                else
                {
                    break;
                }
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
