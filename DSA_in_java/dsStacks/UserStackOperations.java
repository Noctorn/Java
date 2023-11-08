package DSA_in_java.dsStacks;

import java.util.Scanner;

public class UserStackOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Stack Operations: ");
        System.out.println("Enter the size of stack");
        int size = sc.nextInt();
        StackOperations so = new StackOperations(size);
        System.out.println("Enter the Numbers for following operations");
        // System.out.println("1)To add an element into a stack");
        // System.out.println("2)To pop an element from the stack");
        // System.out.println("3)To peek an element into a stack");
        // System.out.println("4)To check if the stack is full or not");
        // System.out.println("5)To check is stack is empty");
        // System.out.println("6)Display stack");
        // System.out.println("9)Exit");
        boolean flag = true;
        while (flag != false) {
            // System.out.println("Do you wish to perform more actions: ");
            // char c = sc.next().charAt(0);
            if (true) {
                System.out.println();
                System.out.println("1)To add an element into a stack");
                System.out.println("2)To pop an element from the stack");
                System.out.println("3)To peek an element into a stack");
                System.out.println("4)To check if the stack is full or not");
                System.out.println("5)To check is stack is empty");
                System.out.println("6)Display stack");
                System.out.println("9)Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        so.PushInStack();
                        break;
                    case 2:
                        so.PopInStack();
                        break;
                    case 3:
                        System.out.println(so.Peek());
                        break;
                    case 4:

                    case 6:
                        so.Print();
                        System.out.println();
                        break;
                    case 9:
                        flag = false;
                        break;

                    default:
                        System.out.println("Enter a valid choice");
                        break;
                }
                // } else if ((c == 'N') || (c == 'n')) {
                // flag = false;
                // return;
            }

        }

    }
}
