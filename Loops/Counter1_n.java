import java.util.Scanner;
public class Counter1_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the value of the n: ");//input from  the user 
        int n=sc.nextInt();
        int count=1; 
        while(count<=n){
            System.out.println(count);
            count++;
        }
        sc.close();
    }
    
}
