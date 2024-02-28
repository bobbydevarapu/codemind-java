import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }


}
