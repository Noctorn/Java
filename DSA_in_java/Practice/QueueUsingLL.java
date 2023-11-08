package DSA_in_java.Practice;

class Node {
    private int data;
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

class Queue {
    Node head;
    Node rear;

    public Queue() {
        head = rear = null;
    }

    public void Enqueue(int d) {
        createNode(d);
    }

    private void createNode(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = rear = n;
            return;
        }
        rear.setNext(n);
        rear = n;
        return;
    }

    public void dequeue() {
        int z = deletehead();
        if (z == -1) {
            System.out.println("Empty queue");
        } else {
            System.out.println(z);
        }
    }

    private int deletehead() {
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

    public void peek() {
        System.out.println(head.getData());
    }

    public void display() {
        Node itr;
        itr = head;
        while (itr != null) {
            System.out.print(itr.getData() + " ");
            itr = itr.getNext();
        }
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.Enqueue(30);
        q1.Enqueue(40);
        q1.Enqueue(50);
        q1.display();
        System.out.println();
        q1.dequeue();
        System.out.println();
        q1.display();
        System.out.println();
        q1.peek();
    }
}
