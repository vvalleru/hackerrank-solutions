int HasCycle(Node head) {
    Node fast = head;
    Node slow = head;
  
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return 1;
    }
  
    return 0;
}