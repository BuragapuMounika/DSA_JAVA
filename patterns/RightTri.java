import java.util.Scanner;
public class RightTri {
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        System.out.println(" enter the number of the rows: ");
        int rows=sc.nextInt();
        System.out.println(" enter the number of the columns :");
        int column=sc.nextInt();
        for(int i=1 ;i <=rows;i++){
            for(int j=1;j<= i ;j++){
                System.out.print("*");
            }
            System.out.println (" ");

        }
        sc.close();
        }
    
}
