import java.util.Scanner;
public class LineaarSearch {
    public static int Linear(int array[],int key){
        for(int i=0;i<=array.length;i++){
            if(key==array[i]){
                return i;
            }
        }
           return -1;

        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter size by the user: ");
        int size =sc.nextInt();

        int arr[]=new int [size];

        System.out.print(" enter the elements by the user: ");
       
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter the key: ");
        int key =sc.nextInt();

       int res = Linear(arr,key);
       if (res != -1) {
        System.out.println("Key found at index: " + res);
    } else {
        System.out.println("Key not found in the array.");
    }

    sc.close(); // Close scanner
}

    }
    

