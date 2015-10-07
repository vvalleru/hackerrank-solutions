Node Insert(Node head,int x) {
    Node newHead = new Node();
    newHead.data = x;
    newHead.next = head;
    
    return newHead;
}