void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
  
    if (head == null)
        return;
    ReversePrint(head.next);
    System.out.println(head.data);
}