import java.util.Scanner;


public class NumPatt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.println("enter the number of the rows: ");
        int r=sc.nextInt();
        System.out.println("enter the number of the column:");
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
            if((i+j)%2==0){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
            System.out.println();
        }
        sc.close();

    }

    
}
