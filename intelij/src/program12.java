import java.util.Scanner;
public class program12 {
    public static void main(String []ved)
    {
        Scanner ip = new Scanner(System.in);



        int i = 1;
        while(ip.hasNextLine())
        {
            String str = "";
                str = str+ ip.nextLine();
            System.out.println(str);
        }



    }
}



//import java.util.Scanner;
/*

public class program12 {
    public static void main(String []ved)
    {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}

*/

