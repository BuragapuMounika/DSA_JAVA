// key value pairs , all are unoque, ex: Hash map,Tree map, Linked Hash Map, 
import java.util.*;
public class Map {
    public static void main(String args[]){
        HashMap <String,Integer> map = new HashMap <> () ;
        map.put("apple",20);
        map.put("ball",60);
        map.put("cat",300);
        System.out.println(map);

        System.out.println(" value of the apple is: "+map.get("apple"));
        System.out.println(" the value of the  cat is : "+ map.get("cat"));
        System.out.println(map.remove("cat"));
        System.out.println(map);


        // for iteration purpose : 
        System.out.println(" the value of the apple is: ");
        for(String key: map.keySet()){
            System.out.println(" the key is: "+key+ " and the value is : "+map.get(key));
        }


        // PriorityQueue <Integer> queue = new PriorityQueue<>();



    }

    
}
