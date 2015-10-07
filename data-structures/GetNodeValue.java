int GetNode(Node head,  int n) {
    Node forward = head;
    Node backward = head;
  
    while (n != 0) {
        forward = forward.next;
        n -= 1;
    }
  
    while (forward.next != null) {
        forward = forward.next;
        backward = backward.next;
    }
  
    return backward.data;
}

