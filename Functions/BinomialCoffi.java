import java.util.Scanner;
public class BinomialCoffi {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=i*fact;

        }
        return  fact;
    }

    public static int Binomial(int num,int r){
        int nfact =factorial(num);
        int nk =factorial(r);
        int minus_nr =factorial(num-r);
        return nfact/ (nk*minus_nr );
    }


    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a n : ");
        int n =sc.nextInt();
        System.out.println("enter the value of the r :" );
        int r=sc.nextInt();
        if(r<=0||r>n||n<0){
            System.out.println("invalid");

        }
        else{
        int result=Binomial (n,r);
        System.out.println(" the binomial factor  of"+ n+ "and"+r+ " is"+result);
    }
}

    
}
