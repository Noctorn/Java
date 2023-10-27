package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question21 {
    public static void main(String[] args) {
        // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.set(1, 100);
        System.out.println(al);
    }
}
