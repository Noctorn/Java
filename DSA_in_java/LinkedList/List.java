package DSA_in_java.LinkedList;

class Node {
    private int data;
    private Node next;

    public Node() {
        // this is default constructor
        data = 0;
        next = null;
    }

    public Node(int d) {
        // this is parameterised constructor
        data = d;
        next = null;
    }

    public void setData(int d) {
        // user entered value to be initialised
        data = d;
    }

    public void setNext(Node n) {
        next = n; // we are setting the reference over here
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // NOW THE FUNCTION OF THE LINKED LIST ARRVIES
    public void insertAtFirst(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        n.setNext(head);
        head = n;
        return;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }
    }
}

public class List {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtFirst(10);
        l.insertAtFirst(20);
        l.insertAtFirst(30);
        l.insertAtFirst(40);
        l.insertAtFirst(50);
        l.insertAtFirst(60);
        l.display();
    }
}
