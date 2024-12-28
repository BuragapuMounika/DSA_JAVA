// import java.util.Scanner;
// public class FuncPar {
//     public static int  sum(int a,int b){
//         int sum=a+b;
//         return sum;

//     }
//     public static int sum(int a,int b,int c){
//         int sum=a+b+c;
//         return sum;
//     }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println(sum(3,5));
    //      System.out.println(sum(3,2,1));
    // }
    import java.util.Scanner;
    public class FuncPar{
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println(sum(3,5));
            System.out.println(sum(3.5f,7.6f));

        }
    }
    
