import java.util.Scanner;
public class Pair {
    public static void  pair(int arr[]){
        for(int  i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println( "(" + arr[i]+ ","+ arr[j]+")");
            }
        }// since it is void there is no need to creat any return .
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println(" enter the elements: ");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
           pair(array);//calling



        }
    }
    
}
