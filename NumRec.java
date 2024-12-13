import java.util.Scanner;
public class NumRec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows: ");
        int r= sc.nextInt();
        System.out.println("enter the columns: ");
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=6;j++){
                System.out.print(j);
            } 
            System.out.println();
              
        }
        sc.close();


    }
    
}
