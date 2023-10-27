package Day9.ExamPractice.Question1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Shape2dDriver {
    
    public static void display2dArea(double ar){
        NumberFormat formatter = new DecimalFormat("#0.0");     
        System.out.println(formatter.format(ar));
    }
    public static void main(String[] args) {
        Circle2d obj1=new Circle2d(20.34);
        Rectangle2d obj2=new Rectangle2d(17.53, 32.12);
        double a=obj1.get_area();
        double b=obj2.getArea();
        display2dArea(a);
        display2dArea(b);
    }
}
