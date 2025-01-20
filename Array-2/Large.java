import java.util.Scanner;
public class Large{

    public static int large(int arr[]){
        int max=arr[0];// Assume the first element is the largest
       
        for(int i=0;i< arr.length;i++){
            // for(int j=i+1;j< arr.length;j++){
                // if(arr[j]>arr[i]){
                //     temp=arr[j];
                //     arr[j]=arr[i];
                //     arr[i]=temp;

                if(arr[i]>max){
                    max=arr[i];
                }

                }
                return max;

            }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of the array: ");
        int size=sc.nextInt();
        
        int array[]=new int[size];

        System.out.println(" enter the elements in the array: ");
        for(int i=0;i< size;i++){
            array[i]=sc.nextInt();

            int res= large(array);
            System.out.println(" largest ele is :"+ res);

        }
    }
}