import java.util.Scanner;
public class SecLar {

    public static int secound(int arr[]){
        int temp=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
             
            }
            return  arr[i];
        }
        
    }
        
    
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter the size the user: ");
        int   size=sc.nextInt();

        int  array[]=new int[size];

        System.out.println(" enter the ele by the user: ");
        for(int i=0;i< size;i++){
            array[i]=sc.nextInt();
int res= secound(array);
System.out.println(" the secound largest element is: "+ res);
        }


        }

         

    }
    

