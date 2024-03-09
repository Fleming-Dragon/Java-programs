import java.util.Scanner;

public class program7 {
    public static void main(String[] ved)
    {

        Scanner ip = new Scanner(System.in);

        String []x = new String[5];
        int []x1 = {0,0,0};
        String []y = new String[5];

        for(int i=0; i< 3;i++)
        {
            String temp = ip.next();
            y[i] = String.format("%-15s" , temp);
            int num = ip.nextInt();

                x[i] = String.format("%03d" , num);

        }

        System.out.println("====================");

        for(int i=0; i< 3;i++)
        {
            System.out.println(y[i]+x[i]);
        }
        System.out.println("====================");
    }
}
