/*task

In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.
To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format
There are  lines of input, and each line contains a single integer.
 */

import java.util.Scanner;

class program4
{
    public static void main(String ved[])
    {
        Scanner ip = new Scanner(System.in);
        int[] arr = new int[3] ;
        for (int i = 0; i < 3 ; i++)
        {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < 3 ; i++)
        {
            System.out.println(arr[i]);
        }

    }

}