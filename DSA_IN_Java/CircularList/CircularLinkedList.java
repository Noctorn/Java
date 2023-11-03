package DSA_IN_Java.CircularList;

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
class Circular{
    Node last;
    public Circular(){
        last=null;
    }

    // insert a node in
    public void inserNode(int d){
        Node n=new Node(d);
        if(last==null){
            last=n;
            last.setNext(last);
            return;
        }
        n.setNext(last.getNext());
        last.setNext(n);
    }
    public void InsertAtLast(int d){
        Node n=new Node(d);
        if(last==null){
            last=n;
            last.setNext(last);
            return;
        }
        n.setNext(last.getNext());
        last.setNext(n);
        last=last.getNext();
    }
    public void InsertAtFirst(int d){
        Node n=new Node(d);
        if(last==null){
            last=n;
            n.setNext(last);
            return;
        }
        n.setNext(last.getNext());
        last.setNext(n);
    }
    public void InsertByPosition(int pos,int d){
        Node n=new Node(d);
        int i;
        if(last==null){
            last=n;
            n.setNext(last);
            return;
        }
        if(pos==1){
            InsertAtFirst(d);
            return;
        }
        Node itr=last;
        for(i=1;i<pos-1 &&itr.getNext()!=last;i++,itr=itr.getNext());
        if(i==pos-1){
            n.setNext(itr.getNext());
            itr.setNext(n);
            return;
        }
        if(itr.getNext()==last){
            InsertAtLast(d);
        }
        n.setNext(itr.getNext());
        itr.setNext(n);
    }

    public void display(){
        Node itr;
        if(last==null){
            System.err.println("Empty list");
            return;
        }
        itr=last.getNext();
        do{
            System.out.print(itr.getData()+" ");
            itr=itr.getNext();
        }while(itr!=last.getNext());
    }

    //code to delete nodes;
    public int DeleteFirstElement(){
        int d;Node deletable;
        if(last==null){
            System.out.println("Empty list");
            return -1;
        }
        if(last.getNext()==last){
            deletable=last;
            d=deletable.getData();
            last=null;
            deletable.setNext(null);
            deletable=null;
            return d;
        }
        deletable=last.getNext();
        d=deletable.getData();
        last.setNext(deletable.getNext());
        deletable.setNext(null);
        deletable=null;
        return d;
    }
    public int DeleteLastElement(){
        Node deletable;
        int d;
        if(last==null){
            System.out.println("Empty List");
            return -1;
        }
        if(last.getNext()==last){
            d=DeleteFirstElement();
            return d;
        }
        Node itr=last;
        while(itr.getNext()!=last){
            itr=itr.getNext();
        }
        deletable=itr.getNext();
        d=deletable.getData();
        last=itr;
        itr.setNext(deletable.getNext());
        deletable.setNext(null);
        deletable=null;
        return d;
    }


}
public class CircularLinkedList {
    public static void main(String[] args) {
        Circular c1=new Circular();
        c1.inserNode(10);
        c1.inserNode(20);
        c1.inserNode(30);
        c1.inserNode(40);
        c1.inserNode(50);
        c1.inserNode(60);
        c1.display();
        System.out.println();
        c1.DeleteLastElement();
        c1.display();
        System.out.println();
        c1.DeleteFirstElement();
        c1.display();
    }   
}
