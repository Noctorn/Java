package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question15 {
    public static void main(String[] args) {
        // 15. Write a Java program to join two array lists.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.addAll(al);   // this is a shallow copy
        System.out.println(al);  
    }
}
