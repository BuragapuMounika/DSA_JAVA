import java.util.Scanner;
public class    IsPrime {
    public static boolean  Prime(int n){
        if(n<2){
           return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }

        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n=sc.nextInt();
        sc.close();//closeing of the scanner


        if(Prime(n)){
            System.out.println(" yes it is prime.");

        }
        else{
            System.out.println(" it is not prime..");
        }
}
}
