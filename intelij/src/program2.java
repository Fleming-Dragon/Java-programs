//collection concepts

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class program2 {

    public static void main(String ved[])
    {


        ArrayList<String> list = new ArrayList<>();

        list.add("Ved");
        list.add("kishor");
        list.add("mahajan");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

}
