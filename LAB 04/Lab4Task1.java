import java.util.Scanner;
public class Lab4Task1
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a, b;
        System.out.println ("Enter a number");
        a=KB.nextInt();
        System.out.println ("Enter another number");
        b=KB.nextInt();
        if (a>b)
        {
            System.out.println("first");
        }
        else
        {
            System.out.println("Not first");
        }
    }
}    