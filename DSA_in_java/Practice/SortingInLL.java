package DSA_in_java.Practice;

class Node {
    int data;
    Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void newNode(int d) {
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
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }
    }

    public void Bubbles() {
        Node end = null;
        Node p, q;
        for (end = null; end != head.getNext(); end = p) {
            for (p = head; p != end; p = p.getNext()) {
                q = p.getNext();
                if (p.getData() > q.getData()) {
                    int temp = p.getData();
                    p.setData(q.getData());
                    q.setData(temp);
                }
            }
        }
    }
}

public class SortingInLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.newNode(20);
        l.newNode(30);
        l.newNode(40);
        l.newNode(80);
        l.newNode(10);
        l.display();
        System.out.println();
         l.Bubbles();
        l.display();
    }
}
