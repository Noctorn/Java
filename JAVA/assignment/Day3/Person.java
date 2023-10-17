package Day3;

public class Person {
    String name;
    int age;
    String gender;
     
    Person(String name,int age,String gender){
        this.name=name;
        this.age=-age;
        this.gender=gender;
    }
    void get_person_data(){
        System.out.println("The name age and gender of the person is: "+name+" "+age+" "+gender);
    }
}
