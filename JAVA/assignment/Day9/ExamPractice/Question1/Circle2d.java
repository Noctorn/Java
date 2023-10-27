package Day9.ExamPractice.Question1;

 public class Circle2d extends Shape2d {
    private double radius;
    private double c_area;
    
    // this is a constructor of class Circle
    public Circle2d(double radius){
        this.radius=radius;
        area(radius);
    } 

    // These are the getters of class Circle
    public double getRadius(){
        return radius;
    }
    public double get_area(){
        return c_area;
    }

    // These are the setters of the class Circle
    public void  setRadius(double radius){
        this.radius=radius;
    }
    public void area(double radius){
        this.c_area=3.14*radius*radius;
    }
    
    @Override
    public void displayArea(){
        System.out.println("Area of circle is: "+ get_area());
    }
    @Override
    void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

   
}
