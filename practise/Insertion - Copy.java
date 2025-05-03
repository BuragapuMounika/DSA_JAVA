import java.util.*;
public class Insertion {
    public static void insert(int arr[],int temp){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the array size: ");
        int n= sc.nextInt();

        int array[]=new int[n];

        System.out.println(" enter the elments in an  array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        insert(array);
        
System.out.println(" the array is: ");
for(int i=0;i< n;i++){
    System.out.println(array);
}

    }
    
}
