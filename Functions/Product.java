import java.util.Scanner;

public class Product {
    public static int  prod(int n1,int n2){
        int res=n1*n2;
   return res;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a number of a: ");
        int a =sc.nextInt();
        System.out.println(" enter the value of b: ");
        int b=sc.nextInt();
        int product= prod(a,b);
        System.out.println(" the product of the "+ a+"and"+b+"is"+product);    
    }
}

