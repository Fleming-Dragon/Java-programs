/*
import java.math.BigInteger;
import java.util.Scanner;

class program10
{
    public static void main(String ved[])
    {
        Scanner ip =new Scanner(System.in);
        int t;
        t = ip.nextInt();
      //  long[] n = new long[t];
        BigInteger[] n = new BigInteger[t];
        for (int i = 0;i< t;i++)
        {

            n[i] = ip.nextBigInteger();

        }
        for (int i = 0;i< t;i++)
        {
            System.out.println( n[i]  +  " can be fitted in");
            if(Byte.MIN_VALUE <= n[i] && Byte.MAX_VALUE >= n[i])
                System.out.println("* byte");
            if(Short.MIN_VALUE <= n[i] && Short.MAX_VALUE >= n[i])
                System.out.println("* short");
            if(Integer.MIN_VALUE <= n[i] && Integer.MAX_VALUE >= n[i])
                System.out.println("* int");
            if(Long.MIN_VALUE <= n[i] && Long.MAX_VALUE >= n[i])
                System.out.println("* long");
            if (n[i] > Long.MAX_VALUE)
                System.out.println(n[i] + " can't be fitted anywhere");


        }

    }
}*/

import java.math.BigInteger;
import java.util.Scanner;

class program10
{
    public static void main(String ved[])
    {
        Scanner ip =new Scanner(System.in);
        int t;
        t = ip.nextInt();


        //  long[] n = new long[t];
        String[] n = new String[t];
        for (int i = 0;i< t;i++)
        {

            n[i] = ip.next();

        }
        for (int i = 0;i< t;i++)
        {
            boolean a,b,c,d;
            a=b=c=d=true;

            try{
                byte b1 = Byte.parseByte(n[i]);

            }
            catch (Exception f)
            {
                a=true;
            }
            try{
                short b1 = Short.parseShort(n[i]);

            }
            catch (Exception f)
            {
                b=true;
            }
            try{
                int b1 = Integer.parseInt(n[i]);

            }
            catch (Exception f)
            {
                c=true;
            }
            try{
                long b1 = Long.parseLong(n[i]);

            }
            catch (Exception f)
            {
                d=true;
            }

            if(a==b==c==d==false)
            {

                System.out.println(n[i] + " can't be fitted anywhere");

            }
            else
                System.out.println( n[i]  +  " can be fitted in");
            if(a==true)
                System.out.println("* byte");
            if(b==true)
                System.out.println("* short");
            if(c==true)
                System.out.println("* int");
            if(d==true)
                System.out.println("* long");


        }

    }
}