import java.util.Scanner;
public class Array {
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        int length;
        System.out.println("enter the size:");
        int number=sc.nextInt();

        int arr[]= new int[number];//array syntex

        for(int i=0; i < arr.length ;i++){
            System.out.print("give the input: ");
               arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");

            }
            

        }

        }
    
    

