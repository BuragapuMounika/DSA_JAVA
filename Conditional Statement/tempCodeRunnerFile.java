public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println(" enter the first number: ");
            int a =sc.nextInt();
            System.out.println(" enter the secound number: ");
            int b=sc.nextInt();
            System.out.println( " enter the operator: ");
         char operator=sc.next().charAt(0);

            switch(operator){