package Day9.Collections.ArrayListExe;
import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ArrayList<Integer> al2=new ArrayList<>();
        // this is the arraylist type conversion of the first list into second list
        al2=(ArrayList)al.clone(); 
        System.out.println(al2);
    }
}
