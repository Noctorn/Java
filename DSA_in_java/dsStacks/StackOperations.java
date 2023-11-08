package DSA_in_java.dsStacks;

import java.util.*;

public class StackOperations {
    private int arr[];
    private int top;

    public StackOperations() {
        arr = new int[5];
        top = -1;
    }

    public StackOperations(int range) {
        arr = new int[range];
        top = -1;
    }

    public void PushInStack() {
        Scanner sc = new Scanner(System.in);
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        } else {
            top += 1;
            arr[top] = sc.nextInt();
        }
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void PopInStack() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return;
        } else {
            int d = arr[top];
            top -= 1;
            System.out.println(d + " Remaining space= " + top);
            return;
        }
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int Peek() {
        int d = arr[top];
        return d;
    }
}
