package Day9.ExamPractice.Question2;

public class JellyFish extends Fish {
    String className = this.getClass().getSimpleName();
    private int legs;
    boolean eyes;
    public int getLegs() {
        return legs;
    }
    public boolean isEyes() {
        return eyes;
    }
    public JellyFish() {
        super();
        this.legs = 8;
        this.eyes = false;
        
    }
    public void sting(){
        System.out.println("My poison stings or can even cause death");
    }
    void display(){
        System.out.println(getGreetings()+" "+getFamily());
        System.out.println("These are the properties of jelly fish: " );
        System.out.println("Does JellyFish has eyes? "+isEyes());
        System.out.println("Number of tentacles: "+getLegs());
        sting();
    }
    
    
}
