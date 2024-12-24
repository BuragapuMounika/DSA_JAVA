import java.util.Scanner;

public class HollowRect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the num of the rows: ");
        int r=sc.nextInt();
        System.out.println(" enter the number of the columns: ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1; j<=c;j++){
                if(i==1|| i==r||j==1||j==c){
                    System.out.print(" *");// print * in border
                }else{
                System.out.print(" ");}}
System.out.println();// move the next line }
sc.close();
}}
    
