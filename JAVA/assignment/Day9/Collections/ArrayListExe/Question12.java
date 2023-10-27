package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question12 {
    public static void main(String[] args) {
        
    // 12. Write a Java program to extract a portion of an array list
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);
        System.out.println(al.subList(1, 3));
    }
}
