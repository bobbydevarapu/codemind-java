import java.util.Scanner;
public class L{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int sn=s.nextInt();
        int sp=s.nextInt();
        if(h>50&&sn>60&&sp>100)
        {
            System.out.println("10");
        }
        else if(h>50&&sn>60)
        {
            System.out.println("9");
        }else if(sn>60&&sp>100)
        {
            System.out.println("8");
        }
        else if(h>50&&sp>100)
        {
            System.out.println("7");
        }
        else if(h>50&&sn>60)
        {
            System.out.println("9");
        }
        else if(h>50||sn>60||sp>100)
        {
            System.out.println("6");
        }
        else System.out.println("5");
    }
}