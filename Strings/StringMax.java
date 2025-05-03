import java.util.Scanner;
public class StringMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fruits[]={"apple","banana","Grapes"};
       String  max=fruits[0];
       for(int i=0;i<fruits.length;i++){
       if(fruits[i].compareTo(max)>0){
        max=fruits[i];
       }

    }
    System.out.println(" the max fruit is: "+ max);
    
}
}