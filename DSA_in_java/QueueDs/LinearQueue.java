package DSA_in_java.QueueDs;

import java.util.*;

public class LinearQueue {
    private int arr[];
    private int front;
    private int rear;

    public LinearQueue() {
        arr = new int[10];
        front = -1;
        rear = -1;
    }

    public LinearQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = arr.length;
    }

    public boolean isFull() {
        if (rear == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if ((front == -1) || (rear - front == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void Enque(int d) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        if (rear == arr.length - 1) {
            arr[rear] = -999;
        }
        rear += 1;
        arr[rear] = d;
    }

    public void deque() {
        int i;
        //
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return;
        } else {
            if (rear == arr.length - 1) {
                for (i = front; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[i] = -999;
                rear -= 1;
            } else {
                int d = arr[front];
                arr[front] = -999;
                System.out.println(d);
            }
        }

    }

    public int QueuePeek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return 0;
        } else {
            int d = arr[front];
            return d;
        }
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -999) {
                continue;
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

}