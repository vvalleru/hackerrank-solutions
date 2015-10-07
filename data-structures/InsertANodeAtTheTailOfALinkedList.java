Node Insert(Node head,int data) {
    Node dummy = new Node();
    Node current = dummy;
    dummy.next = head;
    
    while (current.next != null) {
        current = current.next;
    }
  
    current.next = new Node();
    current.next.data = data;
  
    return dummy.next;
}