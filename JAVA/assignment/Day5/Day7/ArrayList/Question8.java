package Day7.ArrayList;

import java.util.*;

class Persons{
    String name;
    int age;
    String address;
    String phone_number;
    public Persons(String name, int age, String address, String phone_number) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_number = phone_number;
    }
    
}
public class Question8 {
    public static void main(String[] args) {
        // 8. Create a class Person with fields name, age, address, phone number. print object person using array list and linked list.
        Persons p1=new Persons("Rakesh", 18, "pune", "5465423");
        Persons p2=new Persons("Mangesh", 18, "pune", "5465423");
        Persons p3=new Persons("Roopesh", 18, "pune", "5465423");
        Persons p4=new Persons("brijesh", 18, "pune", "5465423");
        Persons p5=new Persons("jignesh", 18, "pune", "5465423");
        Persons p6=new Persons("dhitesh", 18, "pune", "5465423");
        ArrayList<Persons> al=new ArrayList<Persons>();
        al.add(0, p1);
        al.add(1, p2);
        al.add(2, p3);
        al.add(3, p4);
        al.add(4, p5);
        al.add(5, p6);
        Iterator it=al.iterator();
        while(it.hasNext()){
            Persons st=(Persons)it.next();
            System.out.println("Name "+st.name+" age "+st.age+" address "+st.address+" Phone number "+st.phone_number);
        }

        LinkedList<Persons> ll=new LinkedList<Persons>();
        ll.add(0, p1);
        ll.add(1, p2);
        ll.add(2, p3);
        ll.add(3, p4);
        ll.add(4, p5);
        ll.add(5, p6);
        Iterator its=ll.iterator();
        while(its.hasNext()){
            Persons st=(Persons)its.next();
            System.out.println("Name "+st.name+" age "+st.age+" address "+st.address+" Phone number "+st.phone_number);
        }
    }
}
