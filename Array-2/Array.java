import java.util.Scanner;
    public class Array{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            int marks[]=new int [50];// creation  of the array
            System.out.println(" enter the phy marks: ");
           marks[0]=sc.nextInt();
           System.out.println(" enter the maths marks: ");
           marks[1]=sc.nextInt();
           System.out.println(" enter the chemistry  marks: ");
           marks[2]=sc.nextInt();

           System.out.println(" marks[0] is:"+  marks[0]);
           System.out.println(" marks[1] is:"+  marks[1]);
           System.out.println(" marks[2] is:"+  marks[2]);



            // System.out.println(" enter one number: ");
            // int n=sc.nextInt();
            
        }
    }
