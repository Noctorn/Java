package DSA_in_java.Trees;

import java.util.*;

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

class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int d) {
        insert_levelwise(d);
    }

    private void insert_levelwise(int d) {
        Node n = new Node(d);
        Node itr;
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            root = n;
            return;
        }
        q.add(root);
        while (!q.isEmpty()) {
            itr = q.remove();
            if (itr.getLeft() == null) {
                itr.setLeft(n);
                return;
            } else {
                q.add(itr.getLeft());
            }
            if (itr.getRight() == null) {
                itr.setRight(n);
                return;
            } else {
                q.add(itr.getRight());
            }

        }
    }

    public void display() {
        Node itr;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            itr = q.remove();
            System.out.print(itr.getData() + " ");
            if (itr.getLeft() != null) {
                q.add(itr.getLeft());
            }
            if (itr.getRight() != null) {
                q.add(itr.getRight());
            }
        }
    }

    public void inorder() {
        visit_inorder(root);
    }

    private void visit_inorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        visit_inorder(ptr.getLeft());
        System.out.print(ptr.getData() + " ");
        visit_inorder(ptr.getRight());
    }

    public void preorder() {
        visit_preorder(root);
    }

    private void visit_preorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        System.out.print(ptr.getData() + " ");
        visit_preorder(ptr.getLeft());
        visit_preorder(ptr.getRight());
    }

    public void postorder() {
        visit_postorder(root);
    }

    private void visit_postorder(Node ptr) {
        if (ptr == null) {
            return;
        }
        visit_preorder(ptr.getLeft());
        visit_preorder(ptr.getRight());
        System.out.print(ptr.getData() + " ");
    }

}

public class BinaryTrees {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
        bt.insert(60);
        // bt.inorder();
        // System.out.println();
        // bt.preorder();
        // System.out.println();
        // bt.postorder();
        System.out.println();
        bt.display();
    }
}
