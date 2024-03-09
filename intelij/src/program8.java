import java.util.Scanner;

public class program8 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner(System.in);

        int x = ip.nextInt();

        for(int i =1; i < 11;i++)
        {
            System.out.println(x + " x " + i + " = " + x*i  );
        }
    }
}
