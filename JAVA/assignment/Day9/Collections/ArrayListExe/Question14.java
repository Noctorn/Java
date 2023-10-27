package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question14 {
    public static void main(String[] args) {
        // 14. Write a Java program that swaps two elements in an array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        Collections.swap(al, 2, 3);     // using collections class swap function
        System.out.println(al);
    }
}
