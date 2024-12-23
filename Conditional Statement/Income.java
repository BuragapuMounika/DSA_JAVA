import java.util.Scanner;
public class Income{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the income: ");
        int income=sc.nextInt();
        if(income<500000){
            System.out.println(" NO TAX");

        }
        else if(income >=500000 && income<=1000000){
            System.out.println(" 10% TAX");
        }
        else{
            System.out.println("30% TAX");
        }

    }

}

