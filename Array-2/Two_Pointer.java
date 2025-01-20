import java.util.Scanner;
public class Two_Pointer {

    public static int Sort(int arr[],int target){
        int sum=0;
        // Brute-force approach with nested loops

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return 1;
                }
               
            }

        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a size of the array: ");
        int size =sc.nextInt();

        int array[]=new int [size];

        System.out.println(" enter a elements in an array: ");
        for(int i=0;i< size;i++){
            array[i]=sc.nextInt();
        }
       System.out.println("enter the target number: ");
       int target=sc.nextInt();

       //calling...
       int result=Sort(array,target);

       if(result==1){
        System.out.println(" the pair of the target sum found!!");

       }else{
        System.out.println(" the pair of the target sum is not found!!!");
       }

    }
    
}
