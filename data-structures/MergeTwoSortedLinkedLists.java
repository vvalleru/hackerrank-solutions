Node MergeLists(Node headA, Node headB) {
    Node dummy = new Node();
    Node curr = dummy;

    while (headA != null && headB != null) {
      Node min;

      if (headA.data < headB.data) {
        min = headA;
        headA = headA.next;
        min.next = null;
      } else {
        min = headB;
        headB = headB.next;
        min.next = null;
      }

      curr.next = min;
      curr = curr.next;
    }
  
    if (headB != null)
        curr.next = headB;
    if (headA != null)
        curr.next = headA;
  
    return dummy.next;
}

