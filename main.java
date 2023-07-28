import java.util.Scanner;
class main{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the starting number:");
    int start=sc.nextInt();
    System.out.println("Enter the ending number:");
    int end=sc.nextInt();
    int i;
    for(i=start;i<end;i++)
    {
        if(check(i)==true)
        {
            System.out.println(i);
        }


    }
}
    static boolean check(int num)
    {
        int r;
        int sum=0;
        int m=num;
        while(num>0)
        {
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(sum==m)
        {
            return true;
        }
        else{
            return false;
        }

    }
}