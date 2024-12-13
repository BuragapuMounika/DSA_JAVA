import java.util.*;
public class AddDigits{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit by the user: ");
        int digit= sc.nextInt();
int sum=0;


        while(digit>0){

       int lastdigit= digit%10;
       sum=sum+lastdigit;
       digit  =digit/10;
       
}
System.out.println(" sum of the digit :"+ sum);
}
}