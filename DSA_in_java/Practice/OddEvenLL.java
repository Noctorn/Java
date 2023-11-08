package DSA_in_java.Practice;

class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
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

}

public class OddEvenLL {
    public static void OddEven(LinkedList l1, LinkedList l2, int data) {
        if (data % 2 == 0) {
            l1.newNode(data);
        } else {
            l2.newNode(data);
        }
    }

    public static void merger(LinkedList l1, LinkedList l2) {
        Node itr = l1.head;
        while (itr != null) {
            if (itr.getNext() == null) {
                itr.setNext(l2.head);
                return;
            }
            itr = itr.getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for (int i = 1; i < 10; i++) {
            OddEven(l1, l2, i);
        }
        l1.display();
        System.out.println();
        l2.display();

        System.out.println();
        merger(l1, l2);
        l1.display();
        l1.newNode(10);
        l1.newNode(20);
        l1.newNode(30);
        l1.display();
    }
}
