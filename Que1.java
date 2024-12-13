// take the array as input from the user . Search for a given number x and print the index  at which it occurs.


import java.util.*;
public class Que1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the input (size) from the user: ");
        int size=sc.nextInt();

        int number[]= new int[size];//array syntex

        System.out.println("enter the  input(num)");
        for(int i=0;i<=size;i++){
            number[i]=sc.nextInt();
        }

       System.out.println("enter the value of the x: ");
       int x= sc.nextInt();
       //output
       for(int i=0;i<=number.length;i++){
        if(number[i]==x){
            System.out.println("x found at the index of the : "+i);
        }
       }
    }
}
         


    
    

