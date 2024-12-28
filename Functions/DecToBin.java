import java.util.Scanner;
public class DecToBin{
    public static int  Dec(int decnum){
        int  binary = 0;
       int pow=0;


       while(decnum>0){
      int rem =decnum%2;
       binary =binary +rem* (int) Math.pow(10,pow);
       pow++;
       decnum=decnum/2;
       }
       return  binary;

       

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n =sc.nextInt();
        int result= Dec (n);
        System.out.println( " the result is : "+ result);


    }
}