import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int rev=0,rem=0;
        while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        }
        System.out.println(rev);
}
}