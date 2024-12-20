import java.util.Scanner;
public class SumTriplets {

    public static int SumTriplets(int array[],int target){
        int n=array.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j< n;j++){
                for(int k=j+1;k<n;k++){
                    if(array[i]+array[j]+array[k]==target){
                        ans++;
                    }
                }

            }
           
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size: ");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("enter the input elements: ");
        for(int i=0;i < size;i++){
            array[i]=sc.nextInt();

            System.out.println("enter the target  element: ");
            int target=sc.nextInt();

            System.out.println(SumTriplets(array,target));

        }
    }
    
}
