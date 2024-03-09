import java.util.Scanner;
class program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=1;
        n+=sc.nextInt();

        for(int i=1; i<=n;i++){
            if(i%2==1){
                for(int j=1; j<=n-i; j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
            else{
                for(int j=n-i;j>=1;j--){
                    System.out.print (j);
                }
                System.out.println("");
            }


        }
    }
}