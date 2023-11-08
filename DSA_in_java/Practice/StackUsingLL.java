package DSA_in_java.Practice;

class Node {
    private int data;
    private Node next;

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

class StackLinkedList {
    private Node head;

    public StackLinkedList() {
        head = null;
    }

    public void push(int d) {
        createNode(d);
    }

    public void pop() {
        int z = deleteTop();
        if (z == -1) {
            System.out.println("Empty list");
        } else {
            System.out.println(z);
        }
    }

    private int deleteTop() {
        Node deletable;
        int d;
        if (head == null) {
            return -1;
        }
        deletable = head;
        d = deletable.getData();
        head = deletable.getNext();
        deletable.setNext(null);
        deletable = null;
        return d;

    }

    public int peek() {
        return head.getData();
    }

    private void createNode(int d) {
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
        if (head == null) {
            System.out.println("Empty list");
        }
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }

    }

}

public class StackUsingLL {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);
        // s.push(50);
        // s.push(60);
        // s.display();
        // System.out.println();
        // s.pop();
        // System.out.println(s.peek());
    }
}
