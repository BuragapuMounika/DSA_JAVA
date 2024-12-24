import java.util.Scanner;
public class Sum_OF_N {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter the n number by the user:");
        int n=sc.nextInt();

        int sum=0;
        int i=1;

        while(i<=n){
            sum=sum+i;
            i++;
        }
       
        System.out.println("sum:" + sum);
        sc.close();
    }
}
       
    

