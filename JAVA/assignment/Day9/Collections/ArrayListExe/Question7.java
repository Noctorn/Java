package Day9.Collections.ArrayListExe;
 
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        // 7. Write a Java program to search for an element in an array list.
        ArrayList<Integer> al=new ArrayList<>();
        int element=4;
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.contains(element));
    }
}
