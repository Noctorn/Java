package DSA_in_java.Trees;

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node() {
        data = 0;
        left = null;
        right = null;
    }

    public Node(int d) {
        data = d;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class BinarySearch {
    private Node root;

    public BinarySearch() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int d) {
        insert_node(d, root);
    }

    private Node insert_node(int d, Node ptr) {
        if (ptr == null) {
            ptr = new Node(d);
            return ptr;
        } else if (d < ptr.getData()) {
            ptr.setLeft(insert_node(d, ptr.getLeft()));
        } else if (d > ptr.getData()) {
            ptr.setRight(insert_node(d, ptr.getRight()));
        } else {
            System.out.println("Duplicate date");
        }
        return ptr;
    }

    public void inorder() {
        visit_inorder(root);
    }

0    private void visit_inorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        visit_inorder(ptr.getLeft());
        System.out.print(ptr.getData() + " ");
        visit_inorder(ptr.getRight());
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(20);
        bst.insert(2);
        bst.insert(3);
        bst.inorder();
    }

}
