import java.util.Scanner;

public class program6 {
    public static void main(String[] ved)
    {
        Scanner ip = new Scanner(System.in) ;
        int i;
        String str;
        double db;

        i = ip.nextInt();
        db = ip.nextDouble();
        ip.nextLine();
        str = ip.nextLine();

        System.out.println("String: "  +  str);
        System.out.println("Double: "  +  db);
        System.out.println("Int: "  +  i);
    }
}

