// normally foloow the fifo principal.
// ex: priority Queue , Linked List
import java.util.*;
public class Queue {
 public static void main(String args[]){
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(10);
    queue.add(20);
    queue.add(100);
   //  System.out.println(queue);
   while (!queue.isEmpty()){
    System.out.println(queue.poll());
   }
  

    }
    
}
