package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question20 {
    public static void main(String[] args) {
        // 20. Write a Java program to increase an array list size.
        ArrayList<Integer> al=new ArrayList<>(5);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        // this method increases the capacity of arraylist;
        al.ensureCapacity(10);
    }
}
