int FindMergeNode(Node headA, Node headB) {
    Node head = headA;
    int len1 = 0;
  
    while (head != null) {
        len1 += 1;
        head = head.next;
    }
  
    head = headB;
    int len2 = 0;
  
    while (head != null) {
        len2 += 1;
        head = head.next;
    }
  
    int diff = Math.abs(len1 - len2);
    head = (len1 > len2) ? headA : headB;
    
    while (diff != 0) {
        head = head.next;
        diff -= 1;
    }
  
    if (headA != head)
        headB = head;
    else
        headA = head;
  
    while (headA != null && headB != null) {
        if (headA == headB)
            return headA.data;
        headA = headA.next;
        headB = headB.next;
    }
  
    return -1;
}