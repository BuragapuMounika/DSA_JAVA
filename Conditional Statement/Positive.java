import java.util.Scanner;
public class Positive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number by the user: ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(" positive");
        }
        else{
            System.out.println("negitive");
        }
        sc.close();

    }
    
}
