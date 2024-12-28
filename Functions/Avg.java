import java.util.Scanner;
public class Avg {
    public static int avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter 1st  enumber: ");
        int n1 =sc.nextInt();
        System.out.println(" enter 2nd number: ");
        int n2=sc.nextInt();
        System.out.println(" enter the 3rd number: ");
        int n3 =sc.nextInt();
        int result=avg(n1,n2,n3);
        System.out.println(" result is:"+ result );


    }
    
}
