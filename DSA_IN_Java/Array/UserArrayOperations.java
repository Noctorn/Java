package DSA_IN_Java.Array;

import java.util.Scanner;

public class UserArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        // boolean flag = true;
        ArrayOperations ao = new ArrayOperations(size);
        ao.ReadArrayElements();
        ao.displayArrayElemetns();
        System.out.println();
        ao.RemoveDuplicatesV1();
        ao.displayArrayElemetns();
        // ao.ReadArrayElements();
        // ao.RemoveDuplicatesV2();
        // ao.displayArrayElemetns();
        
        sc.close();
    }
}
