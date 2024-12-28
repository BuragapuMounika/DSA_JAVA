import java.util.Scanner;
public class Function {
    public static void Hello(){
       
        System.out.println(" hello world");
        System.out.println(" hello world");
        System.out.println(" hello world");

    }
    public static void  add(int n1,int n2){
        int c=n1+n2;
        System.out.println(c);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a first number:");
        int a = sc.nextInt();
        System.out.println(" enter a 2nd number: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        add( a,b);

    }
}
