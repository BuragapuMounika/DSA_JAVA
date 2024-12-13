// enter the search element in the given array .the element is found in the array then print its indeces other wise print the -1.{1,5,3}

import java.util.*;
public class SearchArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={1,5,3};//array to search 

        System.out.println("enter the search element : ");
        int x = sc.nextInt();

         int ans=-1; //if it is not found.

       
        for(int i=0;i<3;i++){
            if(arr[i]==x){
                ans=i;
            }
       for(i=0;i<=3;i++){
        if(arr[i]==-1){
            System.out.println("it is not found");
        }else{
            System.out.println("the index of the" + x +"is"+ ans  );
        
        }

       }

        }
    }
    
}
