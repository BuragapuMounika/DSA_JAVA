import java.util.Scanner;
public class Two_Pointers {
    public static int   Sort(int  arr[],int target){
        int left=0;
        int rigth=arr.length-1;
        int n=arr.length;
// two pointers method.............
        while(left<rigth){
            int sum=arr[left]+arr[rigth];
            if(sum==target){
                return 1;
            }else if(sum<target){
                left++;
            }else{
                rigth--;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a size: ");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println(" enter the elements in an array: ");
        for(int i=0;i<size;i++){
        array[i]=sc.nextInt();}

    }
    
}
