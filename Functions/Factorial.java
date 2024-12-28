import java.util.Scanner;


public class Factorial {
    public static int  Facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
            return fact;
        }
    
public static void  main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter a number:");
    int n=sc.nextInt();

    if (n < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
    } else {
        int result = Facto(n); // Calling the Facto method
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
    sc.close(); // Close the scanner to avoid resource leaks
}
}
