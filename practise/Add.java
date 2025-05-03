import java.util.Scanner;
public class Add {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of the a: ");
        int a = sc. nextInt();
        System.out.println("enter the value of the b: ");
        int b = sc. nextInt();
    System.out.println(adding(a,b));

    }
    


public static int  adding(int a,int b){
    int c = a+b;
    return c;
}
}