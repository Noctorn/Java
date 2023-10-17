/* 
 * Create a class Programmer with attribute id,speciliazation,
 * salary declare contructors call name and address from Person class. 
 */
package Day4;

public class Programmer{
    int id;
    String speciliazation;
    double salary;

    void display(){
        System.out.println("The id and the speciallizaiton of the salary is: "+id+speciliazation+salary);
    }
    public static void main(String[] args) {
        Programmer p1=new Programmer();
        p1.display();
        Person1 p11=new Person1("rakesh","pune");
        p11.display();
    }
}