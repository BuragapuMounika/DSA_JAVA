import java.util.Arrays;
import java.util.Scanner;
public class Rev{

    public static int []  user(int arr[]){
        int start=0;
        int temp;
        int last=arr.length-1;
        while(start <last){
           temp=arr[start];
            arr[start]=arr[last];
           arr[last]=temp;
            start++;
            last--;
}

return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a size : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println(" enter a elements by the user: ");
        for(int i=0;i< size;i++){
        array[i]=sc.nextInt();
       int [] result =user (array);//calling 
    //    System.out.println( " the reverse array is:  "+ Arrays.toString(result ));


    System.out.println("The reversed array is: ");
    for ( i = 0; i < result.length; i++) { // Use a for loop to display the result
        System.out.print(result[i] + " ");
}
}
sc.close();
}
}