package DSA_in_java.dsStacks;
public class DoubleSidedStack {
    private int arr[];
    private int topA, topB;

    public DoubleSidedStack() {
        arr = new int[10];
        topA = -1;
        topB = arr.length;
    }

    public DoubleSidedStack(int size) {
        arr = new int[size];
        topA = -1;
        topB = arr.length;
    }

    public boolean isFull() {
        if (topB - topA == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmptyA() {
        if (topA == -1) {
            return true;
        } else
            return false;
    }

    public boolean isEmptyB() {
        if (topB == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void pushA(int d) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        } else {
            topA += 1;
            arr[topA] = d;
            return;
        }
    }

    public void pushB(int d) {
        if (isFull()) {
            System.out.println("OverFlow");
        } else {
            topB += 1;
            arr[topB] = d;
        }
    }

}