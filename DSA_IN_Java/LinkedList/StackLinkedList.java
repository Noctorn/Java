package DSA_IN_Java.LinkedList;

class Node{
    private int data;
    private Node next;

    public Node(){
        data=0;
        next=null;
    }
    public Node(int d){
        data=d;
        next=null;
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
class Stack{
    private Node top;
    public Stack(){
        top=null;
    }
    public void CreateNode(int d){
        Node n=new Node(d)
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.CreateNode(10);
        st.CreateNode(20);
        st.display();
    }    
}
