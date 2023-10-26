package Day7.ArrayList;

import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        //  Write a java program to add numbers in an array list and linked list sort the elements in both.
        ArrayList<Integer> ai=new ArrayList<>();
        ai.add(10);
        ai.add(200);
        ai.add(199);
        ai.add(2121);
        ai.add(99);
        Collections.sort(ai);
        System.out.println(ai);

        LinkedList<Integer> li=new LinkedList<>();
        li.add(0, 200);
        li.add(1, 340);
        li.add(2, 50);
        li.add(3, 100);
        li.add(4, 20);
        li.add(5, 6);
        Collections.sort(li);
        System.out.println(li);

    }
}
