package DSA_in_java.SortingDS;

import java.util.*;

class Employee {
    int empid;
    String name;
    String phoneNumber;

    public Employee() {
        empid = 0;
        name = null;
        phoneNumber = null;
    }

    public Employee(int empid, String name, String phonenumber) {
        this.empid = empid;
        this.name = name;
        this.phoneNumber = phonenumber;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Sort extends Employee {
    int size;

    public Sort(Employee[] arr, int size) {
        this.size = size;
        this.name = getName();
        this.phoneNumber = getPhoneNumber();
    }

    public void Bubble() {

    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of array");
        int length = sc.nextInt();
        Employee[] emp = new Employee[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the id name and phone number");
            int num = sc.nextInt();
            String name = sc.next();
            String number = sc.next();
            emp[i] = new Employee(num, name, number);
        }
        Sort s = new Sort(emp, length);

    }
}
