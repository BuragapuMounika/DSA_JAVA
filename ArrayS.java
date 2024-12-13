// take the array as an input and print its elements


import java.util.*;

public class ArrayS {
    public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
      
        System.out.println("enter the number of the size by the user: ");
        int size =sc.nextInt(); 

        int number[]=new int[size];//syntex of the array

         System.out.println("please enter the input: ");
         for(int i=0;i<=size;i++){
          number[i]=sc.nextInt();
         }

         
            for(int i=0;i<=size ;i++ ){
            System.out.println(number[i]);
        }
    }
}

        // int marks[]=new int [3];
        // marks[0]=23;//int phy=23;
        // marks[1]=98;
        // marks[2]=87;

        // int marks[]={98,95,97};
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);



