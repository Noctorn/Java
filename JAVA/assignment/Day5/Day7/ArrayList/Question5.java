package Day7.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Question5 {
    public static void main(String[] args) {
        // Write a java program to add elements in arraylist and print all elements in array list using for each loop.
         ArrayList<Integer> i=new ArrayList<>();
        i.add(100);
        i.add(900);
        i.add(200);
            for(int j=0;j<i.size();j++){
                System.out.println(i.get(j));
            }
    }
}
