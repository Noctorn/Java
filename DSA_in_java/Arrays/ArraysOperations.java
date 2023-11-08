package DSA_in_java.Arrays;

import java.util.*;

public class ArraysOperations {
    private int arr[];

    // default constructor
    public ArraysOperations() {
        arr = new int[6];
        arr[5] = -999;
    }

    public ArraysOperations(int range) {
        arr = new int[range + 1];
        arr[arr.length - 1] = -999;
    }

    public void ReadValues() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
            if (arr[i] == -999) {
                break;
            }
        }
        sc.close();
    }

    public void Print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -999) {
                break;
            } else {
                System.out.print(arr[i] + " ");
            }

        }
    }

    public void LeftShift() {
        int i;
        for (i = 0; arr[i] != -999; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i - 1] = 0;
    }

    public void RightShift() {
        int i;
        for (i = 0; arr[i] != -999; i++)
            ;
        for (i -= 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = 0;
    }

    public void LeftRotate() {
        int i, temp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i - 1] = temp;
    }

    public void RightRotate() {
        int i, temp = arr[arr.length - 2];
        for (i = 0; i < arr.length - 1; i++)
            ;
        for (i -= 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = temp;
    }

    public void InsertAtIndex(int index, int val) {
        int i;
        for (i = arr.length - 2; i > index - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = val;
    }

    public void DeleteAtIndex(int index) {
        int i;
        for (i = index - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public void sortBubble() {
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

}
