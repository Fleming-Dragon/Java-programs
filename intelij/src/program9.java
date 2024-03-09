import java.util.Scanner;
class temp
{
    int a,b,n;
    temp()
    {
        a=b=n=0;
    }

    void getdata()
    {
        Scanner ip = new Scanner(System.in);

        a = ip.nextInt();
        b = ip.nextInt();
        n  = ip.nextInt();

    }

    void display()
    {

        System.out.println();
        for(int i = 0 ; i < n ; i++)
        {

            int sum = a ;
            for(int j = 0; j <=i; j++ ) {
                sum = (int) (sum + Math.pow(2, j) * b);
            }
            System.out.print(sum+" ");
        }

    }
}

public class program9 {
    int a,b,n;
    void getdata()
    {
        Scanner ip = new Scanner(System.in);

        a = ip.nextInt();
        b = ip.nextInt();
        n  = ip.nextInt();

    }

    void display()
    {

        System.out.println();
        for(int i = 0 ; i < n ; i++)
        {

            int sum = a ;
            for(int j = 0; j <=i; j++ ) {
                sum = (int) (sum + Math.pow(2, j) * b);
            }
            System.out.print(sum+" ");
        }

    }
    public static void main(String ved[])
    {
        Scanner ip = new Scanner(System.in);
        int q = ip.nextInt();


        program9[] t1 = new program9[q];
        for(int i = 0; i <q; i ++)
        {
            t1[i] = new program9();
        }

        for(int i = 0; i <q; i ++)
        {
            t1[i].getdata();
        }
        for(int i = 0; i < q; i ++)
        {
            t1[i].display();
        }
    }
}

/*import java.util.*;


public class Solution {

    static int getValue(int a,int b, int n) {

        int sum = a;
        for(int z=n;z>=0;z--) {
            sum = sum + ((int) Math.pow(2,z))*b;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        t = in.nextInt();
        for(int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for(int j =0;j<n;j++) {
                System.out.print(getValue(a,b,j)+" ");
            }
            System.out.println();
        }
    }
}*/
