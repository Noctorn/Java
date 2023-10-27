package Day9.ExamPractice.Question1;

public class Rectangle2d extends Shape2d{
    
    private double R_area;
    private double length;
    private double breath;
    
    // This is a constructor 
    public Rectangle2d(double length,double breath){
        this.length=length;
        this.breath=breath;
        area(length,breath);
    }

    // These are getters of the class Rectangle 
    public double getLength() {
        return length;
    }
    public double getBreath() {
        return breath;
    }
    public double getArea(){
        return R_area;
    }

    // There are the setters for the class rectangle 
    public void setLength(double length) {
        this.length = length;
    }
    public void setBreath(double breath) {
        this.breath = breath;
    }
    public void area(double length,double breath){
        R_area=length*breath;
    }
    
    @Override
    public void displayArea(){
        System.out.println("Area of rectangle is: "+getArea());
    }
    @Override
    void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
    
    
}
