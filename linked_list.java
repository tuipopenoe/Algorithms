// Tui Popenoe
// LinkedList.java

public class LinkedList{
    Node head;

    public static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    public void append(int data){
        return (append(head, data));
    }

    private void append(Node node, int data){
        Node end = new Node(data);
        Node n = head.next;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public int length(){
        return length(head);
    }

    private int length(Node node){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void push(int data){
        return (push(head, data));
    }

    private void push(Node head, int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public int count(int data){
        return (count(head, data));
    }

    private int count(Node node, int data){
        Node current = head;
        int count = 0;
        while(current != null){
            if(current.data == data){
                count ++;
            }
            current = current.next;
        }
        return count;
    }
}