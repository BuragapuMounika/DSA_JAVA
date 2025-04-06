class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class LinkedPalindromme {
    public boolean ispalindrome(Node head){
        if(head == null || head.next ==null){
            return true;
        }
        // find out the middle of the list
        ListNode slow = head, fast = head;
        while(fast!= null || fast.next != null){
            slow = slow.next;
            fast = fast .next.next;
        }
        // reverse the secound half of the list
         ListNode secoudhalf = reverse(slow);

    
    // reverse the secound half of the list 1->2->3->2->1
    private    Node  reverse (Node  head){
        Node prev = null;
        Node next = head.next;
        head = prev;
        prev= head;
       head= next;

    }
    return prev;

// compare the two halves
Node firsthalf = head;


    
}
