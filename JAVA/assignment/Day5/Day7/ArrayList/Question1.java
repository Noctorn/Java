package Day7.ArrayList;

import java.util.*;
public class Question1 {
    // Write a java program to find whether arrayList is empty or not.
    public static void main(String[] args) {
        ArrayList<String> aa=new ArrayList<String>();
        aa.add("Hello");
        if(aa.size()==0){
            System.out.println(" empty");
        }
        else{
            System.out.println("not Empty");
        }
        System.out.println(aa.size());

    }
}
