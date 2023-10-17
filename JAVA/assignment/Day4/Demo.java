/* 
 * 1. Create a class Person1 with attributes name, Address. Create a Class date with dd,mm,yy attributes. Create class demo with main method and print name address and joining date of Person using this keyword.
 */
package Day4;

public class Demo{
    private int dd,mm,yy;
    private String name,address;

    Demo(Date get_Date,Person1 get_Person1){
        get_Date.date_display();
        get_Person1.display_p1();
    }
    public static void main(String[] args) {
        Date d1=new Date(16, 5, 2003);
        d1.date_display();
        Person1 p1=new Person1("Mehdi","lucknow");
        p1.display_p1();
        Demo dd=new Demo(d1, p1);
        
    }
}   