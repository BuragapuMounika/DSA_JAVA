import java.util.Scanner;
public class SecLarge {

    public static int large(int array[] ){
        int n=array.length;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(array[i]>max)
            max=array[i];

        }

    }
   return max;
}

public static int SecLarge(int array[],int target){
    int n=array.length;

    int max  =large(array);//calling the method

    for(int i=0;i<=n;i++){
        if(array[i]==max){
            array[i]=Integer.MIN_VALUE;
        }
}

int SecLarge= large(array);

}
    public static void main(string args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println(" enter the size: ");
        int size =sc.nextInt();

        int array[]=new int[size];

        System.out.println("enter the inputs: ");
        for(int i=0;i< size;i++){
        array[i]=sc.nextInt();

        


    }


    }
    
}
