package Day5;

class Student {
  int roll_num;
  String name;
  int phone;

  Student() {
    roll_num = 0;
    name = "";
    phone = 0;
  }

  Student(int roll_num, String name, int phone) {
    this.roll_num = roll_num;
    this.name = name;
    this.phone = phone;
  }

  void display() {
    System.out.println("The name of the student is: " + name + " roll number: " + roll_num +" phone number: " + phone);
  }
}

class Section extends Student {
  String class_name;
  char class_id;
  College college_name;
  College college_id;

  Section() {
    super();
    class_name = "NULL";
    class_id = 'N';
  }

  Section(String class_name, char class_id) {
    super(19, "Abhijeet", 1928192819);
    this.class_id = class_id;
    this.class_name = class_name;
  }

  void get_info(String class_name, char class_id, College college_name, College college_id) {
    this.class_name = class_name;
    this.class_id = class_id;
    this.college_name = college_name;
    this.college_id = college_id;
  }

  void display() {
    super.display();
    System.out.println("The class name and id will be: " + class_name + class_id);
    System.out.println("college id and name will be: " + college_id.college_id + " " + college_name.college_name);
  }
}
class College {
    int college_id;
    String college_name;
    College(){
        this("Dell",420);
        college_id=0;
        college_name=" ";
    }
    College(String name,int id){
        System.out.println("Constructor called");
        this.college_id=id;
        this.college_name=name;
    }

}

public class Supp {
  public static void main(String[] args) {
    Section s = new Section();
    College c=new College("Dell", 420);
    System.out.println("College name: "+c.college_name);
    System.out.println("Collgeid: "+c.college_id);
    s.get_info("finalyear", 'A',c,c);
    s.display();
  }
}
