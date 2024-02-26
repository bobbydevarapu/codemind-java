import java.util.Scanner;
public class K{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int disk=t*s*b*512;
        System.out.println(disk*2);
        
    }
}