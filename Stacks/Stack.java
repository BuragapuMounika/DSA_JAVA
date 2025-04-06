class Node{
    int data;
    Node next;

public Node(int data){
    this.data=data;
    this.next=null;
}
}

class StackLinkedList{
    private Node top;

public StackLinkedList(){
    this.top=null;
}


public void push(int data){
    Node newNode = new Node(data);
    newNode.next =top;
    top=newNode;
}

public int  pop(){
    if(top==null){
        System.out.println("stack is empty");
return -1;
    }
    else{
//  top
//  ↓
 // [30] -> [20] -> [10] -> null
 
        int data= top.data;
        top=top.next;
        return data;// return the popped data
    }
}

    public int  peek(){
        if(top==null){
            return -1;
        }
return top.data;
    }

    public boolean isEmpty(){
        if(top==null){
           System.out.println(" underflow");
           return true;
        }

return false;
    }
    public class Stack{
        public static void main(String args[]){
            StackLinkedList stack = new StackLinkedList();
            stack.push(10);
            stack.push(20);
System.out.println(" the pushed element is : " +stack.peek());
    }
    }
    }
