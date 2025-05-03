import java.util.Scanner;
public class Linearr{
 
    public static void linear(int arr[],int key){
        boolean linear =false;
        for(int i=0;i< arr.length;i++){
        if(arr[i]== key){
                System.out.println(i);
                 linear = true;
                 break;

            }
            if(linear){
                System.out.println("  the element is  at index:   "+i);
            }else{
                System.out.println(" the element is not found !!");
            }
        }
    }
public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the array size: ");
    int n= sc.nextInt();
    int arr[]= new int [n];
    System.out.println(" enter the elements in an array: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
    System.out.println(" enter the key value: ");
    int key = sc.nextInt();

    linear(arr,key);

    }

}
