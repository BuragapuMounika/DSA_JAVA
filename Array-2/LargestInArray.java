import java.util.Scanner;
public class LargestInArray {

    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void  main(String rags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter size of the array: ");
        int size =sc.nextInt();

        int array[]=new int [size];

        System.out.println(" enter the  input for the  array:");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
// calling 
        int large =max(array);
          
              // Output the result
        System.out.println("The largest element in the array is: " + large);

        sc.close(); // Close the Scanner
    }
}

