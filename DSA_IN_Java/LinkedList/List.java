package DSA_IN_Java.LinkedList;

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

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // this code is to insert value at frist index:
    public void InsertValue(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        n.setNext(head);
        head = n;
    }

    // code to insert value at last:
    public void InsertAtLast(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        Node itr = head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }
        itr.setNext(n);
    }

    // insert value at position
    public void InsertAtPosition(int d, int pos) {
        int i;
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        if (pos == 1) {
            n.setNext(head);
            head = n;
            return;
        }
        Node itr = head;
        for (i = 1; i < pos - 1 && itr.getNext() != null; i++) {
            itr = itr.getNext();
        }
        n.setNext(itr.getNext());
        itr.setNext(n);

    }

    // delete the nodes:
    public int deleteFistNode() {
        Node deletable;
        int d;
        if (head == null) {
            System.out.println("Empty List");
            return -1;
        }
        deletable = head; // to hold the address head is aiming towards;
        head = head.getNext(); // head to look at new node;
        d = deletable.getData(); // extracting data node;
        deletable = null; // removing node;
        return d;
    }

    // code to delete hte last node
    public int deleteLastNode() {
        Node deletable;
        int d;
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        if (head.getNext() == null) {
            d = head.getData();
            deletable = head;
            head = null;
            deletable = null;
            return d;
        }
        Node itr = head;
        while (itr.getNext().getNext() != null) {
            itr = itr.getNext();
        }
        deletable = itr.getNext();
        d = deletable.getData();
        itr.setNext(null);
        deletable = null;
        return d;
    }

    // code to delete the value by index:
    public int deleteByIndex(int pos) {
        Node deleteable;
        int d, i;
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        if (pos == 1) {
            deleteable = head;
            d = deleteable.getData();
            head = head.getNext();
            deleteable = null;
            return d;
        }
        Node itr = head;
        for (i = 1; i < pos - 1 && itr.getNext() != null; i++) {
            itr = itr.getNext();
        }
        deleteable = itr.getNext();
        d = deleteable.getData();
        deleteable = null;
        itr.setNext(null);
        return d;

    }

    // insert with sort:
    public void InsertBySort(int d) {
        Node n = new Node(d);
        if (head == null || d < head.getData()) {
            n.setNext(head);
            head = n;
            return;
        }
        Node itr = head;
        while (itr.getNext() != null && d > itr.getNext().getData()) {
            itr = itr.getNext();
        }
        n.setNext(itr.getNext());
        itr.setNext(n);
    }

    // insert before value:

    public void InserBeforeValue(int value, int d) {
        Node n = new Node(d);
        Node itr = head;
        while (itr.getNext() != null) {
            if (value == itr.getNext().getData()) {
                // System.out.println("Found");
                n.setNext(itr.getNext());
                itr.setNext(n);
                break;
            }
            itr = itr.getNext();
        }

    }

    public void InserAfterValue(int value, int d) {
        Node n = new Node(d);
        Node itr= head;
        while (itr.getNext() != null) {
            if (value == itr.getData()) {
                n.setNext(itr.getNext());
                itr.setNext(n);
                break;
            }
            itr = itr.getNext();
        }
    }

    // this code is to print the elements:
    public void display() {
        if (head == null) {
            System.out.println("Entered list is empty: ");
            return;
        }
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }

    }

    // this is the code to rever the linked list:
    public void reverseList() {
        Node next, prev, itr = head;
        next = prev = null;
        while (itr != null) {
            next = itr.getNext();
            itr.setNext(prev);
            prev = itr;
            itr = next;
        }
        head = prev;
    }
}

public class List {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.InsertBySort(10);
        l1.InsertBySort(20);
        l1.InsertBySort(30);
        l1.InsertBySort(40);
        l1.InsertBySort(50);
        l1.InsertBySort(60);
        l1.InsertBySort(70);
        l1.display();
        System.out.println();
        l1.InserBeforeValue(30, 25);
        l1.display();
        System.out.println();
        l1.InserAfterValue(30, 35);
        l1.display();
        System.out.println();

    }
}
