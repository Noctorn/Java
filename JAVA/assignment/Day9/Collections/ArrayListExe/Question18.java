package Day9.Collections.ArrayListExe;

import java.util.*;
public class Question18 {
    // 18. Write a Java program to test whether an array list is empty or not.
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        if(al.size()==0){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }
        
    }
}
