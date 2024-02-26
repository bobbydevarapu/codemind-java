import java.util.Scanner;
public class Color{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s1=sc.next().charAt(0);
        
         if(s1=='V'||s1=='v')
         {
             System.out.println("Violet");
         }
         else if(s1=='I'||s1=='i')
         {
             System.out.println("Indigo");
             
         }
         else if(s1=='B'||s1=='b')
         {
             System.out.println("Blue");
         }
         else if(s1=='G'||s1=='g')
         {
             System.out.println("Green");
         }
          else if(s1=='Y'||s1=='y')
         {
             System.out.println("Yellow");
         }
          else if(s1=='O'||s1=='o')
         {
             System.out.println("Orange");
         }
          else if(s1=='R'||s1=='r')
         {
             System.out.println("Red");
         }
         else System.out.println("-1");
    }
}