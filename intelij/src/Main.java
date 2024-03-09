import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=ip.nextInt(),i,j;

        for(i = n ; i > 0 ; i--){

            if(i %2 == 0)
            {
                for(j = 1 ; j < i+1 ; j++)
                {

                    System.out.print(j);
                }
            }
            else
            {
                for(j = i ; j > 0 ; j--)
                {

                    System.out.print(j);
                }
            }
            System.out.println();

            //System.out.print(i);
        }

    }
}