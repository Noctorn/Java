package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        // 9. Write a Java program to copy one array list into another.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ArrayList<Integer>al2=new ArrayList<>(al);
        // do not use clone here i repeat do not use clone;
        // al2.clone();
        System.out.println(al2);
    }
}
