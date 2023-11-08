package DSA_in_java.Practice;

class Student {
    private int rollnum;
    private String name;
    private int standard;

    public Student(int rollnum, String name, int standard) {
        this.rollnum = rollnum;
        this.name = name;
        this.standard = standard;
    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}

class Node {
    Student data;
    Node next;

    public Node(Student obj) {
        this.data = obj;
        this.next = null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class StackList {
    private Node head;

    public StackList() {
        head = null;
    }

    public void push(Student obj) {
        createNewNode(obj);
    }

    private void createNewNode(Student obj) {
        Node n = new Node(obj);
        if (head == null) {
            head = n;
            return;
        }
        n.setNext(head);
        head = n;
    }
}

public class StackObjects {
    public static void main(String[] args) {
        StackList sl = new StackList();
        Student s1 = new Student(10, "Shivansh", 10);
        sl.push(s1);
    }
}
