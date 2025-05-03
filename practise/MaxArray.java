import java.util.Scanner;
public class MaxArray {
    public static int max(int arr[]){
        // int max=Integer.MAX_VALUE();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
       
        if(arr[i]>max){
            max=arr[i];
        }


    }
    return max;
}
    public static void main(String  args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]={10,20,30,40,50};
      int res= max(arr);
       System.out.println(" the max is : " +res +" ");




    }
    
}
