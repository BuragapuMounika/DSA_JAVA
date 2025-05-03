import java.util.Scanner;
public class closest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int k = sc.nextInt();//8
        System.out.println(" enter the 2nd number: ");
        int l= sc.nextInt();//12
        System.out.println(" enter the target value: ");
        int t= sc. nextInt();//10
         int diffk= Math.abs(k-t);
         int diffl=Math.abs(l-t);
         if(diffk<diffl){
            System.out.println(" k is closer to "+t);
         }
           else if(diffl<diffk){
                System.out.println(" l is closer to"+t);
            }
            else{
                System.out.println("both are closer to the " +t);
            }
         }


    }

    

