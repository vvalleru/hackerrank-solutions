Node Reverse(Node head) {
    if (head == null)
        return head;
    
    Node curr = head;
    Node prev = null;
    Node next = curr.next;
    
    while (next != null) {
        curr.next = prev;
        curr.prev = next;
        
        prev = curr;
        curr = next;
        next = next.next;
    }
    curr.next = prev;
    curr.prev = null;
    
    return curr;
}