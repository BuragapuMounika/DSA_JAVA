import java.util.Scanner;
public class Bubblee{

    public static void  bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        

    }
    public static void  main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the size of the array: ");
        int n= sc.nextInt();
        int arr[] =  new int [n];
        System.out.println(" enter the elements : ");
        
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        bubble(arr);
         for(int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
         }

    }
}