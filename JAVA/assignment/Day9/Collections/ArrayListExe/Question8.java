package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        // 8. Write a Java program to sort a given array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(6);
        System.out.println(al);
        al.sort(null);
        System.out.println(al);
    }
}
