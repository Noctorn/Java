package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        // 5. Write a Java program to update an array element by the given element.
        ArrayList<Integer> al=new ArrayList<>();
        int index=4;
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.set(4, index);
        System.out.println(al);
    }
}
