class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev= null;
    }
}

class Doubly{
    private Node head;
    private Node tail;

    // Insert at beginning
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {  // If the list is empty
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    
// insert  at end
public void insertend(int data){
    Node newNode = new Node(data);
if(head == null){
    head= newNode=tail;
}
Node temp = head;
tail.next=newNode;
newNode.prev=tail;
tail=newNode;
}

// delete a node
public void delete(int key){
Node temp= head;

    if(temp.data == key){
        temp= temp.next;
        
        if(head!=null){
            head.prev=null;
           
        }
        return;
    }

    // i fthe head node itself contain the deleted node 
    if( temp.data  == key){
        head=temp.next;
        if( head != null){
            head.prev = null;
        }
        return ;
    }

    // search for the node to be deleted
    while(temp != null && temp.data != key)
{
    temp=temp.next;
}
    

// if the not fount
if(temp== null){
    return;
}

if(temp.next != null){
    temp.next.prev=temp.prev;
}
if(temp.prev  !=  null){
temp.prev.next= temp.next;
}


}
  // Display the list
  public void display() {
    Node temp = head;
    System.out.print("Doubly Linked List: ");
    while (temp != null) {
        System.out.print(temp.data);
        if (temp.next != null) {
            System.out.print(" ⇄ ");
        }
        temp = temp.next;
    }
    System.out.println();
}

public static void main(String args[]){
Doubly list = new Doubly();
list.insert(10);
list.insert(20);
list. insertend(30);
list.insertend(40);
list.display();
list.delete(20);
list.display();
}

}