Node SortedInsert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    
    if (head == null) {
        return newNode;
    }
    
    Node curr = head;
    
    while (curr.next != null && curr.next.data < data) {
        curr = curr.next;
    }
    
    if (curr.next == null) {
        curr.next = newNode;
        newNode.prev = curr;
    } else {
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
    }
    
    return head;
}