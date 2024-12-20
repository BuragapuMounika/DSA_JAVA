import java.util.Scanner;
import java.util.Arrays;
public class Sorting2 {

    public static void printArray(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size: ");
         int size = sc.nextInt();

        //  int array []=new int[size];
        // initialize the array
        int array[]={7,8,3,1,2};

         for(int i=0;i<=size;i++){
         System.out.println(" enter the input: ");
         array[i]=sc.nextInt();
         }

        //  for(int i=0;i<=size;i++){
        //     for(int j=1;j<=size;j++){

        for(int  i=0;i<=array.length-1;i++){
            for(int j=0;j<=array.length-i-1;j++){
                if(array[i]>array[i+1] ){
                    //swap
                int temp=array[i];
                array[i]=arr[i+1];
                array[i+1]=temp;
                
            }
            System.out.println()
            System.out.println(array[i],+ " " );
        }
}
    
}
