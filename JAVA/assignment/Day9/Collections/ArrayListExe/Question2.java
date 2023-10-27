package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        // 2. Write a Java program to iterate through all elements in an array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
