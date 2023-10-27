package Day9.Collections.ArrayListExe;

import java.util.ArrayList;

public class Question4 {
    //  Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void main(String[] args) {
        int index=3;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.get(index));
        System.out.println(al);
    
    }
}
