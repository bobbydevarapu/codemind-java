import java.util.*;
public class K{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
           sum=sum+arr[i];
        }
        System.out.println(sum);
        
    }
}