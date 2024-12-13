import java.util.Scanner;
public class Pattern5{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of the rows:");
        int r= sc.nextInt();
        System.out.println("enter the number of the columns: ");
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

}