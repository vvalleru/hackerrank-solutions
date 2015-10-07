Node Reverse(Node head) {
    Node curr = head;
    Node prev = null;
    
    while (curr.next != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
  
    curr.next = prev;
    return curr;
}