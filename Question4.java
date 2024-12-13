//find the maximum and minimum number in the array of the integer
import java.util.*;
public class Question4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //enter the size
    
        System.out.println("enter the size by the user:");
        int  size=sc.nextInt();
        int number[]=new int[size];
        //enter the number{input}

        System.out.println("enter te number or input by the user:");
        for(int i=0;i<size ;i++){
          number[i]= sc.nextInt();
        }

int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;

for(int i=0;i<number.length;i++){
    if(number[i]<min)
    {
        min=number[i];
    }
        if(number[i]>max)
        {
            max=number[i];
        }
        }

        System.out.println("large number is: "+max);
        System.out.println("small number is:"+ min);
        }
    }

      


    






    

