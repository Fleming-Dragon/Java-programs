import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class program14 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner (System.in);

        int year, date , month;

        month = ip.nextInt();
        date = ip.nextInt();
        year = ip.nextInt();


        month = month - 1;
        year = year - 1900;

        Date d = new Date(year , month ,date);


        Calendar c = Calendar.getInstance();
        c.setTime(d);

        int day = c.get(Calendar.DAY_OF_WEEK);

        switch(day)
        {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
        }



    }
}
