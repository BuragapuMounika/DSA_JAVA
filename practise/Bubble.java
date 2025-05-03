//desending order
import java.util.*;
public class Bubble{

    public static void Bubble(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]<arr[j+1]) {
              temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;

                }
            }
        }


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print(" enter the size of the array: ");
        int n= sc. nextInt();
        int array[] =new int [n];
        System.out.print(" enter the elements in th earray: ");
        for(int i=0;i< n;i++){
        array[i]=sc.nextInt();
        }

        Bubble(array);
         for( int i=0;i< array.length;i++){
            System.out.println(array[i]);
         }
       
    }
}
