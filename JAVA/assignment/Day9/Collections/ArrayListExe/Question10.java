package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        // 10. Write a Java program to shuffle elements in an array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        Collections.shuffle(al);  // usin functions of Collections class
        System.out.println(al);
    }
}
