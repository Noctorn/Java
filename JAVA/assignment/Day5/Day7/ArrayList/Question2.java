package Day7.ArrayList;

// import java.util.ArrayList;
import java.util.LinkedList;

public class Question2 {
    public static void main(String[] args) {
        // Write a java program to find whether LinkedList is empty or not.
        LinkedList<Integer> i=new LinkedList<Integer>();
        i.add(20);
        i.add(20);
        i.add(20);
        if(i.size()==0){
            System.out.println("empty");
        }else{
            System.out.println("not empty");
        }
    }
}
