import java.util.Scanner;
public class Palindrome {
    public static boolean palindrome(int n){
        int rev=0;
        int original=n;
         
        while(n != 0){
            int rem =n%10;
            rev=rev*10+rem;
            n=n/10;
            
        }
       if(original ==rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter one number : ");
        int n=sc.nextInt();
        if(palindrome(n)){
            System.out.println("   the number is: "+ n);

        }
        else{
            System.out.println(" the number is not palindrome.");
        }
        sc.close();

    }
    
}
