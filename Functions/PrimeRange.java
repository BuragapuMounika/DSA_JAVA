import java.util.Scanner;

public class PrimeRange {
    // method to check the  number is prime or not....
    public static boolean isprime (int n){
        if(n<2){
            System.out.println(" is is not a prime!!");
        }
        else{
           for(int i=2;i< Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
           }
           return true;
        }

        //method to find out the prime in a range....
        public static void range(int n){
            for(int i=2;i< Math.sqrt(n);i++){
                if(isprime(i)){
                    System.out.println( i+ " ");
                }
        }
        System.out.println();
}
// main method 
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println(" enter a number: ");
    int n =sc.nextInt();
    if(isprime(n)){
        System.out.println(" prime");
    else{
        System.out.println(" it's is not a prime number!!!");
    }    
}
