class Node{
    int data;
    Node next;

    public  Node (int data){
        this.data=data;
        this.next=null;

    }
}



public class Circular {
    private Node head;
    private Node tail;
    private Node prev;
    

public void inseratbeg(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=tail=newNode;
    }
    newNode.next=head;
    head=newNode;
    tail.next=newNode;

}

public void insertend(int data){
    Node newNode = new Node(data);
    if(head== null){
        head=tail=newNode;
    }
    else{
        tail.next=newNode;
        tail=newNode;
        newNode=head;
    }
}
// delete aa node by a value
public void delete(int key){// delete the head Node
    Node current = head, prev=null;
    if(current.data == key){
        if(head.data == key){
            tail.next= head.next;
            head= head.next;
        }
        else if( current== tail){
            
        }
    
      

        }
    }

}


}
