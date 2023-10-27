package Day9.Collections.ArrayListExe;

import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        // 11. Write a Java program to reverse elements in an array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        
        //either use arralist function and display it 
        System.out.println(al.reversed());
        
        // or use Collections class methods to reverse the array list
        Collections.reverse(al);
        System.out.println(al);
    }
}
