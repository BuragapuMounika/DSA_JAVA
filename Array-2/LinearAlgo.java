import java.util.Scanner;
public class LinearAlgo {

    public static int search(int arr[],int n,  int x){
      
        for(int i=0;i< n ;i++){
            if(arr[i]==x){
                return i;
            }

            }
            return -1;
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a size by the user:");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println(" enter the elements by the user: ");
        for(int i=0;i< size;i++){
        array[i]=sc.nextInt();
    }

    System.out.println(" enter the search element: ");
    int  x = sc.nextInt();

    int result=search(array,size ,x);
    if(result==-1){
        System.out.println(" it is not a linear search"+ result );

    }
    else{
        System.out.println(" it is a linear searcch");
    }
    }
}

