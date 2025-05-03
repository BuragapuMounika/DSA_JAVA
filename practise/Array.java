import java.util.Scanner;

public class Array{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a size");
        int n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("enter the" + n+"element : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("enter the search elemnt:");
        int x = sc.nextInt(); 


        boolean found = false;
        for(int i=0;i<n;i++){
        if( x == array[i]) {
            found=true;
            break;

        }
    }
    if(found){
        System.out.println(" yes it is found!!");
    }
    else{
        System.out.println(" no it is not found!!");
    }
sc.close();


        
    }
}