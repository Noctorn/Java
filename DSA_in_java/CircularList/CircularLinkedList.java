package DSA_in_java.CircularList;

class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d) {
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }
}

class CLinkedList {
    Node last;

    public CLinkedList() {
        last = null;
    }

    // creating a node:
    public void createNode(int d) {
        Node n = new Node(d);
        if (last == null) {
            last = n;
            last.setNext(last);
            return;
        }
        n.setNext(last.getNext());
        last.setNext(n);
    }

    public void InsetAtFirst(int d) {

    }

    public void display() {
        if (last == null) {
            System.out.println("Empty");
            return;
        }
        Node itr = last.getNext();
        do {
            itr = itr.getNext();
            System.out.print(itr.getData() + " ");
        } while (itr != last.getNext());
    }

}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLinkedList cl = new CLinkedList();
        cl.createNode(10);
        cl.createNode(20);
        cl.createNode(30);
        cl.createNode(40);
        cl.createNode(50);
        cl.display();
    }
}
