import java.util.Scanner;

public class Do_While {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=1;
    do{
        System.out.println(" hello world!");
        count++;
    }   
    while(count<=10);
    sc.close();

    }

}


// .......................break statement.................
// import java.util.Scanner;
// public class Break {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
// for(int i=1;i<=5;i++){


//     if(i==3){
//         break;
//     }
//     System.out.println(i);
// }

//......................continue statement....................
// import java.util.Scanner;
// public class Break {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
// if(i==3){
//     continue;

// }
// System.out.println(i);
// }
//     }
// }
// output..............->           1  2  4  5



    




