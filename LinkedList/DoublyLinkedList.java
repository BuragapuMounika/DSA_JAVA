class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Doubly {
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

    // Insert at end
    public void insertend(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete a node
    public void delete(int key) {
        Node temp = head;

        // If the list is empty
        if (head == null) {
            return;
        }

        // If the head node is to be deleted
        if (head.data == key) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // If the list becomes empty
            }
            return;
        }

        // If the tail node is to be deleted
        if (tail.data == key) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // If the list becomes empty
            }
            return;
        }

        // Search for the node to be deleted
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If node is not found
        if (temp == null) {
            return;
        }

        // Update links to remove the node
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
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

    public static void main(String args[]) {
        Doubly list = new Doubly();
        list.insert(10);
        list.insert(20);
        list.insertend(30);
        list.insertend(40);
        list.display();  // Expected Output: 20 ⇄ 10 ⇄ 30 ⇄ 40
        
        list.delete(20);
        list.display();  // Expected Output: 10 ⇄ 30 ⇄ 40
        
        list.delete(40);
        list.display();  // Expected Output: 10 ⇄ 30
        
        list.delete(10);
        list.display();  // Expected Output: 30
        
        list.delete(30);
        list.display();  // Expected Output: (empty list)
    }
}
