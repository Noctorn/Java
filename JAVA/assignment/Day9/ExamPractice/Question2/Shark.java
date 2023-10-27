package Day9.ExamPractice.Question2;

public class Shark extends Fish  {
    String className = this.getClass().getSimpleName();
    private int size;  //size in feet;
    private int teeth;  
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getTeeth() {
        return teeth;
    }
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
    public void bite(){
        System.out.println("My bite force is 84,000 tones");
    }

    public Shark() {
        super();
        this.size = 7;
        this.teeth =300;
        getGreetings();
        getFamily();
        
    }
    void display(){
        System.out.println(getGreetings()+" "+getFamily());
        System.out.println("These are the properties of shark: ");
        System.out.println("Size: "+getSize());
        System.out.println("Number of teeth: "+getTeeth());
        bite();
    }
    
}
