import java.util.Scanner;
public class Binary{
    public static void binary(int arr[],int key){
        int low=0, high=arr.length-1;
        // int mid =(low+high)/2;
        boolean found = false;
        while(low<=high){
            int mid= (low+high)/2;

            if(arr[mid]==key){
                System.out.println(" found the value ar the index: "+mid);
                found = true;
                break;

            }
            else if(arr[mid]<key){
                low =mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(! found){
            System.out.println("  sorry !");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the size of the array: ");
        int n=sc.nextInt();
        int arr[] = new int [n];
        System.out.println(" enter the value  of the array: ");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(" enter the search key : ");
        int key = sc. nextInt();
        binary(arr,key);


    }
}