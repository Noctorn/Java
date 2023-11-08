package DSA_in_java.Practice;

class Worker {
    private int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Node {
    private Worker data;
    private Node next;

    public Node(Worker data) {
        this.data = data;
        this.next = null;
    }

    public Worker getData() {
        return data;
    }

    public void setData(Worker data) {
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
    Node head, rear;

    public Queue() {
        this.head = null;
        this.rear = null;
    }

    public void newNode(Worker obj) {
        Node n = new Node(obj);
        if (head == null) {
            head = rear = n;
            return;
        }
        n.setNext(rear);
        rear = n;
    }

    public void print() {
        Node itr = head;
        while (itr != null) {
            System.out.println(itr.getData().getId() + " " + itr.getData().getName());
            itr = itr.getNext();
        }
    }
}

public class QueueObjects {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        Worker w1 = new Worker(10, "adsadja");
        q1.newNode(w1);
        q1.print();
    }
}
