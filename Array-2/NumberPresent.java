import java.util.Scanner;
public class NumberPresent{

public static int number(int arr[],int key){
    for(int i=0;i< arr.length;i++){
        if(key==arr[i]){
            System.out.println(" the elelment is present in the array at" + i);
            return i;
        }
     

    }
    return -1;
    
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter the size by the user: ");
    int size=sc.nextInt();

    int array[]=new int [size];

    System.out.print(" enter the elements by the array:  ");
    for(int i=0; i< size;i++){
        array[i]=sc.nextInt();

        System.out.print(" enter a search  by the user: ");
        int n=sc.nextInt();

        int result= number(array,n);//calling 
        System.out.println(" the  number is present in the array at : "+ i);


    }

}
}