// createing a node class to represent a elements in the node

class Node{
    int data;
    Node next;

// create a constructor to initialise the nodeand to represent the current data and the next poointer

public Node(int data){
    this.data=data;
    this . next = null;

}
}
class SinglyLinkedList{
    private Node head;
    private Node tail;



//insert at beginning
public  void insert(int data){
    Node newNode = new Node(data);


    if(head==null){
        head=newNode;
        head=tail;
        return;
    }
    else{
        Node temp=head;
        while(temp.next !=  null){
            temp=temp.next;
        }
        temp.next=newNode; //insert at end
 }

 public void delete(int key){// deletion of the node 
    Node temp=head,prev=null;

    while(temp!=null && temp.data==key){
        temp=temp.next;
        return;
    }

    public void inserEnd(int data){//insert at end
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            head=tail;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }


        public boolean search(int key){// search for a key
            Node temp=head;
if(temp!=null){
    while(temp.data==key){
        return true;
    }
   
         return false;
    
}

// reverse the linked list
public void  reverse(){
    Node prev=null,current=head,next=null;
    while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }

head=prev;
}
 public void display(){
    SinglyLinkedList List =new SinglyLinkedList();
    List.insert(10);
    List.insert(20);
    List.insert(30);
    List.display(); // Output: 10 -> 20 -> 30 -> null

    List.delete(20);
    List.display(); // Output: 10 -> 30 -> null

    System.out.println("Search 30: " + List.search(30)); // Output: true

    List.reverse();
    List.display(); // Output: 30 -> 10 -> null


 }

        }

    }
 }


    }
}
