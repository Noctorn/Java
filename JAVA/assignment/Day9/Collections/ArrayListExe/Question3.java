package Day9.Collections.ArrayListExe;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        // 3. Write a Java program to insert an element into the array list at the first position.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.addFirst(0);
        System.out.println(al);
    }
}
