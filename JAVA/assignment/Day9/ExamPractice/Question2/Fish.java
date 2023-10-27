package Day9.ExamPractice.Question2;

public class Fish {
   
    private String greetings;
    private final String family="Vertebrata";

    // constructor 
    public Fish(){
        greetings="Hi I'm a  who lives in ocean";
    }
    public String getGreetings() {
        return greetings;
    }
    public String getFamily(){
        return family;
    }
    void display(){
        System.out.println(getGreetings()+" "+getFamily());
    }

}
