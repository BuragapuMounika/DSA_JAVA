import java.util.Scanner;

public class InvertedStar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the rows: ");
        int r=sc.nextInt();
        System.out.println(" enter the number ofthe columns: ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<= r-i+1 ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();

    }
    
}
