package Day3;

public class Employee {
    int emp_id;
    String emp_dept;
    double emp_sal;
    
    Employee(){
        emp_id=0;
        emp_dept="null";
        emp_sal=0;
    }
    void set_data(int id,String dept,int sal){
        emp_id=id;
        emp_dept=dept;
        emp_sal=sal;
        return;
    }
    void get_emp_data(){
        System.out.println("The id is:"+emp_id);
        System.out.println("The deparment is: "+emp_dept);
        System.out.println("The salaray is: "+emp_sal);
    }
    
}

 