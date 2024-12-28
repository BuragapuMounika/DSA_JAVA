import java.util.Scanner;
public class Even {

    public static boolean even(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a number: ");
        int n=sc.nextInt();
        if(even(n)){
            System.out.println(" yes ! it is even  "+ n);
        }
        else{
            System.out.println(" no it is not even");
        }
    }
    
}
