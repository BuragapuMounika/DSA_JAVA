import java.util.*;
public class MaxArray {
    public static void main(String srgs[]){
        Scanner sc= new Scanner(System.in);

        int ans=0;

        int arr[]={1,5,3};//array syntex  ans=5
        for(int i=0;i<3;i++){
            if(arr[i]>ans){
              ans = arr[i];
            
            }
        }
        System.out.println( ans );






    }
    
}
