// import java.util.Scanner;
// public class ReverseString{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         String str="lalita";
//         StringBuilder sb = new StringBuilder(str);// String Builder is looking liek a stringbut it is not a string here you have to convert it in to a string
//        sb.reverse();
//        System.out.println( " the result is : "+sb.toString());

       
//     }
// }

import java.util.*;
public class ReverseString{
    public static void main(String args[]){
        String str = "name";
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
            System.out.println(rev);

        }

    }
