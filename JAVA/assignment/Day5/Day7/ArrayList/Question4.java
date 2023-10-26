package Day7.ArrayList;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        // Write a java program to find whether LinkedList is empty or not.
        ArrayList<Integer> i=new ArrayList<>();
        i.add(100);
        i.add(900);
        i.add(200);
        ListIterator<Integer> it = i.listIterator(i.size());
            while (it.hasPrevious()) {
                System.out.println(it.previous());
            }
    }
}
