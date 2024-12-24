import java.util.Scanner;
public class Character{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a row: ");
        int r=sc.nextInt();
        // System.out.println(" enter a column: ");
        // int c=sc.nextInt();
        char  ch='A';
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();}
}
