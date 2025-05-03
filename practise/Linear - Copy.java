import java.util.Scanner;

public class Linear {

    public static int linear(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==key){
             return 1;
            }
        }
        return -1;
    }
    
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" enter the elements: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key: ");
        int key = sc.nextInt();
        
        int result = linear(arr,key);

        System.out.println(" the key is : "+result);



    }
}
