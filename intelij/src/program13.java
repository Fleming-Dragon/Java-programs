import java.util.Scanner;

public class program13 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner (System.in);

        int b , h ;
        b = ip.nextInt();
        h = ip.nextInt();

        if(b<= 0 || h <= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.println(b*h);
        }
    }
}
