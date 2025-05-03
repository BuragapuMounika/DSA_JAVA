import java.util.Scanner;

public static void  insertion(int arr[]){
    for(int i=1;i<arr.length;i++){
        int key=arr[i]; 
        int j = i-1;
        while(j>=0 && j>=key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;


        }


    }
   

    


public class Insetion {
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=  new int [n];
        System.out.println(" enter the elements in an array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();


        }

        System.out.println(" the sorted array: ");
        insertion(arr);
    }
    
}
