package Day3;

import java.text.DecimalFormat;

public class Area {
    static double area_of_triangle(float b,float h){
        return (b*h)*.5f;
    }
    static double area_of_cirle(float r){
        return (double)3.14*r*r;
    }
    static double area_of_square(float a){
        return a*a;
    }
    static double area_of_rhombus(float p,float q){
        return (double)(0.5*(p*q));
    }
    public static void main(String[] args) {
        // Area a=new Area();
        System.out.println(area_of_cirle(14.5f));
        System.out.println(area_of_rhombus(13.34f, 43.83f));
        System.out.println(area_of_square(55.34f));
        System.out.println(area_of_triangle(8.8f, 12.4f));
    }
}
