import java.util.Scanner;
public class Max {

    public static int max(int arr [] ){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
return max;
    }
   
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size: ");
    int n = sc. nextInt();
    int arr[] = new int[n];
    System.out.println(" enter the elements: ");
    for(int i= 0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    int result= max(arr);
    System.out.println(" the result is: "+result);

 }

    }
    

