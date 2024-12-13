 // take the array of the  names as an input from the user and print them on the screen.
 

 import java.util.*;
 public class Queation2 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

      
        System.out.println("enter the size of the array: ");
        int size =sc.nextInt();
        String  name [] = new String [size];//array syntex 


        System.out.println("enter the input by the useer: ");
        for(int  i=0;i<size;i++){
        name[i]= sc.next();}

            //output
        
            for(int i=0;i<size ;i++){
            System.out.println(name[i]);

}

for(int i=0;i< name.length;i++){
    System.out.println("name"+ (i+1)+"is:"+name[i]);
}
}


    }
    


