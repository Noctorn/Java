package DSA_in_java.DoubleyLinkedList;

class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node() {
        data = 0;
        next = null;
        prev = null;
    }

    public Node(int d) {
        data = d;
        next = null;
        prev = null;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node p) {
        prev = p;
    }

    public Node getPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }
}

class DoubleyLinkedList {
    private Node head;

    public DoubleyLinkedList() {
        head = null;
    }

    public void InsertAtFirst(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        } else {
            n.setNext(head);
            n.setPrev(null);
            head.setPrev(n);
            head = n;
        }
    }

    public void InsertAtLast(int d) {
        Node n = new Node(d);
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node itr = head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }
        n.setPrev(itr);
        itr.setNext(n);
    }

    public void InsertByPosition(int d, int pos) {
        Node n = new Node(d);
        int i;
        if (head == null) {
            head = n;
            return;
        }
        if (pos == 1) {
            head.setPrev(n);
            n.setNext(head);
            head = n;
        }
        Node itr = head;
        for (i = 1; ((i < pos - 1) && (itr.getNext() != null)); i++, itr = itr.getNext())
            ;
        n.setPrev(itr);
        n.setNext(itr.getNext());
        itr.setNext(n);
        n.getNext().setPrev(n);
        return;
    }

    // this is the code to delete first element :
    public int DeleteFirstNode() {
        Node deletable;
        int d;
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        deletable = head;
        d = deletable.getData();
        head = head.getNext();
        head.setPrev(null);
        deletable.setNext(null);
        deletable = null;
        return d;

    }

    // this is the code to delete the last element:
    public int DeleteLastNode() {
        Node deletable, itr = head;
        int d;
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        if (head.getNext() == null) {
            deletable = head;
            d = deletable.getData();
            head = null;
            head.setPrev(null);
            return d;
        }
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }
        deletable = itr;
        d = deletable.getData();
        itr.getPrev().setNext(null);
        deletable.setPrev(null);
        deletable = null;
        return d;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }
    }

    public String toString() {
        String str = new String();
        if (head == null) {
            str += "Empty list";
            return str;
        }
        Node itr = head;
        str += "List: ";
        while (itr != null) {
            str += "->" + itr.getData();
            itr = itr.getNext();
        }
        str += "\n";
        return str;
    }

    public int DeleteByPosition(int pos) {
        int d, i;
        Node deleteable, itr;
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        if (pos == 1) {
            deleteable = head;
            d = deleteable.getData();
            head = deleteable.getNext();
            deleteable.getNext().setNext(null);
            deleteable.setNext(null);
            deleteable = null;
            return d;
        }
        itr = head;
        for (i = 1; i < pos - 1 && itr.getNext() != null; i++, itr = itr.getNext())
            ;
        deleteable = itr.getNext();
        d = deleteable.getData();
        itr.setNext(deleteable.getNext());
        deleteable.getNext().setPrev(itr);
        deleteable.setPrev(null);
        deleteable.setNext(null);
        deleteable = null;
        return d;
    }
}

public class Ddly {
    public static void main(String[] args) {
        DoubleyLinkedList dl = new DoubleyLinkedList();
        dl.InsertAtFirst(10);
        dl.InsertAtFirst(20);
        dl.InsertAtFirst(30);
        dl.InsertAtFirst(40);
        dl.InsertAtFirst(50);
        dl.InsertAtFirst(60);
        dl.InsertAtFirst(70);
        dl.InsertAtFirst(80);
        dl.display();
        System.out.println();
        System.out.println(dl.DeleteFirstNode());
        System.out.println();
        System.out.println(dl.DeleteByPosition(4));
        System.out.println();
        dl.display();

    }
}
