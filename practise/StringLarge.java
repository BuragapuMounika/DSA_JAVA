import java.util.Scanner;
public class StringLarge{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
       String fruit= "apple";
       char max = fruit.charAt(0);

       for (int i=0;i< fruit.length();i++){
        if(fruit.charAt(i)>max){
            max=fruit.charAt(i);
        }

       }
       System.out.println(max);





    }
}