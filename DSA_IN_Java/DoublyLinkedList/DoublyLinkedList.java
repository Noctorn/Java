package DSA_IN_Java.DoublyLinkedList;

class Node{
    private int data;
    private Node prev;
    private Node next;
    public Node(){
        data=0;
        next=prev=null;
    }
    public Node(int d){
        data=d;
        next=prev=null;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node n){
        next=n;
    }
    public Node getNext(){
        return next;
    }
    public void setprev(Node p){
        prev =p;
    }
    public Node getPrev(){
        return prev;
    }
}
public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList (){
        head=null;
    }
    public void insertAtFirst(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
            return;
        }
        if(head.getNext()==null){
            n.setNext(head);
            head.setprev(n);
            return; 
        }

    }
    


}
