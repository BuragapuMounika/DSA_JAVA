
// import java.util.Scanner;

// public class ArrayAsFunction {

//     public static void update(int marks[]) {
//         // Start loop from 0 to marks.length - 1
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1; // Increment each mark by 1
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int array[] = {97, 98, 99}; // Initial array

//         update(array); // Update array values

//         // Print the updated marks
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]); // Output each element of the array
//         }
//     }
// }



import java.util.Scanner;
public class java{
    public static void array(int marks[]){
        for(int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]={ 95,96,97};// initialisation of the array
array(marks);
//output
for(int i=0;i< marks.length;i++){
System.out.println(marks[i]);

    }
}
}