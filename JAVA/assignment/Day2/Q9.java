/*  9. Create A Class Box write method to calculate area 
of circle,area of cube,area of rectangle(Note: use non-parametrized methods)
*/
package Day2;

import java.util.Scanner;

public class Q9 {
    static float area_of_circle(){
        float area;
        int r=15;
        area=(float)3.14*r*r;
        return area;
    }
    static double area_of_cube(){
        double area;
         int a=15;
        area=6*a*a;
        return area;
    }
    static double area_of_rectangle(){
        double area;
         int a=15,b=17;
        area=a*b;
        return area;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the values: ");
        // int radius=sc.nextInt();
        double c=area_of_circle();
        double cu=area_of_cube();
        double r=area_of_rectangle();
        System.out.println("the area of the following figure is: "+c);
        System.out.println("the area of the following figure is: "+cu);
        System.out.println("the area of the following figure is: "+r);
        sc.close();
    }
}
