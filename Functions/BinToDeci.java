import java.util.Scanner;
public class BinToDeci{

    public static int bintodeci(int binnum){
        int pow=0;
        int dec=0;
        while(binnum >0){
            int lastdigit=binnum%10;
            dec= dec+lastdigit * (int)Math.pow(2,pow);
            pow++;
            binnum=binnum/10;
        }
       
        return dec;
    }
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number: ");
        int n=sc.nextInt();
    int result =  bintodeci( n );
    System.out.println(result);
    sc.close();
    }
}
    


