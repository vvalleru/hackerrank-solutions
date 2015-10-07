Node Delete(Node head, int position) {
    Node dummy = new Node();
    Node prev = dummy;
    dummy.next = head;
  
    while (position != 0) {
        prev = prev.next;
        position -= 1;
    }
  
    if (prev.next != null)
        prev.next = prev.next.next;
    else
        prev.next = null;
  
    return dummy.next;
}