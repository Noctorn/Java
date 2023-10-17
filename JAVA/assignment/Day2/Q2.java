// 2. Create A Class Box write method to calculate area of circle,area of cube,area of rectangle(Note use parameterized methods)

package Day2;

import java.util.Scanner;

public class Q2 {
    static float area_of_circle(int r){
        float area;
        area=(float)3.14*r*r;
        return area;
    }
    static double area_of_cube(int a){
        double area;
        area=6*a*a;
        return area;
    }
    static double area_of_rectangle(int a,int b){
        double area;
        area=a*b;
        return area;
    }
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values: ");
    int radius=sc.nextInt();
    double c=area_of_circle(radius);
    double cu=area_of_cube(radius);
    double r=area_of_rectangle(radius, radius);
    System.out.println("the area of the following figure is: "+c);
    System.out.println("the area of the following figure is: "+cu);
    System.out.println("the area of the following figure is: "+r);
    sc.close();
}
}
