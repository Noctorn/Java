package Day9.Collections.ArrayListExe;

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        //  array list capacity of 20 elements 
        ArrayList<Integer> al=new ArrayList<>(20);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        // System.out.println(al);
        al.trimToSize();
        System.out.println(al);
    }
}
