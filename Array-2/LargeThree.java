import java.util.Scanner;
public class LargeThree {
    public static void  Three(int arr[]){
        if(arr.length<3){
            System.out.println(" it is invalid");
        return;
    }
            // int first=0,secound=0,third=0;
int first=Integer.MIN_VALUE, secound=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
            for(int i=0;i< arr.length;i++){
                int num=arr[i];
                // update the largest numbers
                if(first==0||num>first){
                    third= secound;
                    secound=first;
                    first=num;
                }else if(secound==0||num>secound){
                    third=secound;
                    secound=num;
                }else if(third==0||num>third){
                    third=num;
                }
            }
            if(third==0){
                System.out.println(" not enought array");
            } else{
                System.out.println(" the distinct elements are "+ first+ ","+ secound +","+third);
            }

        }

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size: ");
int size=sc.nextInt();

int array[]=new int[size];

System.out.println(" enter the elements: ");
for(int i=0;i< size ;i++){
array[i]=sc.nextInt();

    }
    
}
}
