package Day7.ArrayList;

import java.util.*; 
// import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList<Integer> al=new ArrayList<Integer>();
        // al.add(10);
        // al.add(20);
        // al.add(30);
        // al.add(40);
        // System.out.println(al);
        // int i=0;    
        // while(i<al.size()){
        //     System.out.println(al.get(i));
        //     i++;
        // }
        ArrayList<String> as=new ArrayList<String>();
        as.add("Rajesh");
        as.add("Manges");
        as.add("Lungesh");
        as.add("jignesg");
        as.add("kalesh");
        as.add("Roopesh");
        as.add("yogesg");
        Iterator it =as.listIterator();
       
        while(it .hasNext()){
             String x=(String) it.next();
            if(x.equals("yogesg")){
                System.out.println("Happy birtday");
            }
            else{
                System.out.println(x);
            }
        }


    }
}
