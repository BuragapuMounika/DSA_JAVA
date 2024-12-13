import java.util.*;

public class Avg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the secound number:");
        int b =sc.nextInt(); 
        System.out.println("Enter the third number:");
        int c =sc.nextInt();
        int avg= (a+b+c)/3;
        System.out.println(" the avg of the three numbers is: "+ avg);

    }
    
}
