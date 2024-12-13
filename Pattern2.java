import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*"); // Prints * on the same line
            }
            System.out.println(); // Moves to the next line after each row
        }
        
        sc.close(); // Close the Scanner properly
    }
}
