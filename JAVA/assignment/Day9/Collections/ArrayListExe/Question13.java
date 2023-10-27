package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        // 13. Write a Java program to compare two array lists.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ArrayList<String> al3=new ArrayList<>();
        al3.add("a");
        al3.add("a");
        al3.add("a");
        al3.add("a");
        ArrayList<Integer> al2=new ArrayList<>(al); //shallow copying arraylist
        System.out.println(al2.equals(al));        // this will return true
        System.out.println(al3.equals(al2));       // this will return false
    }
}
