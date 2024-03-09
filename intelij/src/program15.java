import java.util.Scanner;

public class program15 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner (System.in);

        int a = ip.nextInt();

        if(a < -100 || a >100)
        {
            System.out.println("Wrong answer");
        }
        else {
            System.out.println("Good Job");
        }
    }
}
