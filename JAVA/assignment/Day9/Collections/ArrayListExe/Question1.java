package Day9.Collections.ArrayListExe;

import java.util.*;

public class Question1 {
    // 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Blue");
        al.add("Purple");
        al.add("Black");
        al.add("Grey");
        al.add("Orange");
        Iterator<String> it=al.iterator();
        System.out.println(al);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
