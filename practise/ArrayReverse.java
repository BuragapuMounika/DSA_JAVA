import java.util.*;
public class ArrayReverse {
    
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // for(int i=4;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        for(int i=list.size()-1 ; i>=0;i--){
            System.out.println(list.get(i));
        }


    }
}
