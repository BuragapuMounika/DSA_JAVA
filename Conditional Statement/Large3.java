
import java.util.*;public class Large3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println(" enter the 2nd num: ");
        int b=sc.nextInt();
        System.out.println(" enter the 3rd  element: ");
        int c =sc.nextInt();

        if (a>b && a>c){
            System.out.println(" a is big.");
        }
        else if( b>a && b> c){
            System.out.println(" b is big.");
        }
        else{
            System.out.println(" c is big.");
        }
    }
    
}
