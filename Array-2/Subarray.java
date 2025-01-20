import java.util.Scanner;

public class Subarray {
    public static int sub(int array[]){
        for(int i=0;i<array.length;i++){
            int start=array[i];
            for(int j=i+1;j<array.length;j++){
                int end=array[j];
                for(int k=start;k<=end;k++){
                    System.out.println(k);
                    return k;
                }
              
              

                }

            }
        }
    
    


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter a size: ");
    int size=sc.nextInt();
    int array[]=new int[size];
    System.out.println(" enter the elements: ");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();

    }
}
}