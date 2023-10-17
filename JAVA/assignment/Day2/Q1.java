// Create A Student Class with fields id,age and name and print default values without initializing.
package Day2;

// This is a student  class : where Q1=Student ;
class Q1{ 
    int age,roll_num;
    String name;
    public static void main(String[] args) {
        Q1 s1=new Q1();
        System.out.println("Name of student : "+s1.name);
        System.out.println("Age of student: "+s1.age);
        System.out.println("Roll number of student: "+s1.roll_num);
    }
}