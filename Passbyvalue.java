public class Passbyvalue {


    void change(int a){
        a=a*100;
    }
    public static void main(String args[]){

        int a=10;
        System.out.println("before changing value: ");
        change(a);
        System.out.println("after the changing value: ");

    }
    
}
