Node InsertNth(Node head, int data, int position) {
    Node dummy = new Node();
    Node prev = dummy;
    dummy.next = head;
    
    while (position > 0) {
        prev = prev.next;
        position -= 1;
    }
  
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = prev.next;
    prev.next = newNode;
  
    return dummy.next;
}