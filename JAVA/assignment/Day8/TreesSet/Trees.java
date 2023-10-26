package Day8.TreesSet;
import java.util.*;
public class Trees {
    public static void main(String[] args) {
        // ArrayList<InfowayStudents>al=new ArrayList<>();
        InfowayStudents i1=new InfowayStudents(202, "Pune", "Cdac", "Shruti", 21, "233423123",10);
        InfowayStudents i2=new InfowayStudents(202, "Pune", "Cdac", "Aditi", 21, "233423123",14);
        InfowayStudents i3=new InfowayStudents(202, "Pune", "Cdac", "Mehdi", 21, "233423123",13);
        InfowayStudents i4=new InfowayStudents(202, "Pune", "Cdac", "Roopali", 21, "233423123",9);
        InfowayStudents i5=new InfowayStudents(202, "Pune", "Cdac", "Shikha", 21, "233423123",11);
        InfowayStudents i6=new InfowayStudents(202, "Pune", "Cdac", "Tejaswasni", 21, "233423123",23);

        TreeSet<InfowayStudents> ts=new TreeSet<>();
        ts.add(i1);
        ts.add(i2);
        ts.add(i3);
        ts.add(i4);
        ts.add(i5);
        ts.add(i6);

        for(InfowayStudents i:ts){
            System.out.println("ID "+i.getID()+" Name "+i.getName()+" Age "+i.getAge()+" Phone "+i.getPhone());
        }

        // TreeMap<Integer,InfowayStudents> tm=new TreeMap<>();
        // al.add(i1);
        // al.add(i2);
        // al.add(i3);
        // al.add(i4);
        // al.add(i5);
        // al.add(i6);
    //     tm.put(1,i1);
    //     tm.put(2,i2);
    //     tm.put(3,i3);
    //     tm.put(4,i4);
    //     tm.put(5,i5);
    //     tm.put(6,i6);
    //    for(Map.Entry<Integer,InfowayStudents>entry: tm.entrySet()){
    //         int key=entry.getKey();
    //         InfowayStudents val=entry.getValue();
    //         System.out.println("S.no."+key+" Name: "+val.getName()+" Age "+val.getAge()+" Phone "+val.getPhone());
    //         System.out.println(" Center code "+val.getCenter_code()+" Course opted "+val.getCourse_name()+" location "+val.getLocation());
    //    }
 }
}
class Infoway  {  
    private int center_code;
    private String location;
    private String course_name;

    public int getCenter_code() {
        return center_code;
    }
    
    public void setCenter_code(int center_code) {
        this.center_code = center_code;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Infoway(int center_code, String location, String course_name) {
       setCenter_code(center_code);
       setLocation(location);
       setCourse_name(course_name);
    }
    void display(){
        System.out.println("Infoway details: "+"Center code: "+center_code+" Course offer: "+course_name+" at location: "+location);
    }


}
class InfowayStudents extends Infoway implements Comparable<Infoway> {
    private String name;
    private int age;
    private String phone;
    private int id;

    public InfowayStudents(int center_code, String location, String course_name, String name, int age, String phone,int id) {
        super(center_code, location, course_name);
        setAge(age);
        setName(name);
        setPhone(phone);
        setID(id);
    }
    public void setID(int id){
        this.id=id;
    }
    public int getID(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    void display(){
        System.out.println("Student details");
        System.out.println("Name "+getName()+" Age "+getAge()+" Phone "+getPhone());
        System.out.println("Course name "+getCourse_name()+" Center code "+getCenter_code()+" location "+getLocation());
    }

    @Override
    public int compareTo(Infoway o) {
    if (id > getID()) {
        return 1;
    } else if (id < getID()) {
        return -1;
    } else {
        return 0;
    }
    

}
}