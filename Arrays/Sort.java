import java.util.Scanner;
import java.util.Arrays;
public class Sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size:  ");
        int size=sc.nextInt();
        
        int arr[]=new int[size]; //initialize an array

        for(int i=0;i<size;i++){
            System.out.println("enter the input: ");
            //input the elements in to the array
            arr[i]=sc.nextInt();
        }
           //print the array elements in to the array
        //     for(  int i=0;i<size;i++){
        //         System.out.println(arr[i]+ " ");
        //     }


        //     sc.close();

        // }


        // sort an array
        Arrays.sort(arr);

        //display the array

        System.out.println(" the sorted array is: ");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();


    }
    
    }
    

