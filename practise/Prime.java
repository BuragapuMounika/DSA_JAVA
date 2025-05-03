import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean isprime = true;

        if (n <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        if (isprime) {
            System.out.println("Yes, it is prime");
        } else {
            System.out.println("No, it is not prime!!");
        }
    }
}
