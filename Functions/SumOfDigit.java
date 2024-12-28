import java.util.Scanner;
public class SumOfDigit {

    public static int  digit(int n){
        int sum=0;
        while(n>0){
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    return sum;
}
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit: ");
        int n=sc.nextInt();
        int sum=digit(n);
            System.out.println("The sum of the digits is: " + sum);

        sc.close();
    }
}

    

