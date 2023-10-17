package Day4;

import java.util.Scanner;

public class Person1 {
    private String name;
    private String address;
    Person1(String name,String address){
        this.name=name;
        this.address=address;
    }
    void get_date(){
        System.out.println("enter date");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String address=sc.nextLine();
        this.name=name;
        this.address=address;
        sc.close();
    }
    void display(){
        System.out.println("The name of the person is: "+name);
        System.out.println("The address of person is: "+address);
    }
}
