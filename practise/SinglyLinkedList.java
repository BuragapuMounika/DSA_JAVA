
public class SinglyLinkedList{
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
           this.next=next;
}
    }

    // method to add a node at the end 
Node head;
Node tail;
   

    public static void add(int data){
        Node newNode= new Node( data);
        if(head == null){
            newNode=head;

        }

    }

}