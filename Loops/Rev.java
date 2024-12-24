import java.util.Scanner;
public class Rev {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a nummber: ");
        int n =sc.nextInt();
        int rev=0;
          while(n!=0){
            int digit=  n%10;//extracting last digit 3
           rev =rev*10+digit;
            n=n/10;

        }
        System.out.println(" the reverse number is "+ rev);


    

sc.close();
    }
}
