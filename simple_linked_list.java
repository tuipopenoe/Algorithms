// Tui Popenoe
// Simple Linked List
class Node{
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this.next;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}