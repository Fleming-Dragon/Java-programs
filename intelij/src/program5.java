import java.util.Scanner;

public class program5 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner(System.in);
        int n ;
        n = ip.nextInt();

        if(n%2 != 0)
        {    System.out.println("Weird");}
        else
        {  if(n < 5)
           {
               System.out.println("Not Weird");
           }
           else if(n >= 5 && n < 20)
           {
               System.out.println("Weird");
           }
           else
           {
               System.out.println(" Not Weird");
           }

        }

    }
}
