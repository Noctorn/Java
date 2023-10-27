package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        //  Write a Java program to remove the third element from an array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }
}
