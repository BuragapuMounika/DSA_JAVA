import java.util.Scanner;
public class Leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the year by the user: ");
        int year=sc.nextInt();
        if((year%4==0)&& (year % 100 != 0)||(year % 400 ==0))                                                                                                   {
            System.out.println(" leap");
        }
        else{
            System.out.println(" it is not a leap year!");
        }
        sc.close();

    }
   
    
}

