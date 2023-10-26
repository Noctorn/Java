package Day7.ArrayList;

import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        // Write a java program to add 13,12,18,40, write a logic to remove only odd elements from the list and print only even numbers
        ArrayList<Integer> ai=new ArrayList<>();
        ai.add(10);
        ai.add(11);
        ai.add(12);
        ai.add(13);
        ai.add(14);
        ai.add(15);
        for(int i=0;i<ai.size();i++){
            if(ai.get(i)%2==0){
                System.out.println(ai.get(i));
            }
        }
    }
}
