package Day5.Random;

import java.util.Scanner;

class Help{
    int a,b;

    public Help(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
    
}
public class Hell {
    public static void main(String[] args) {
        System.out.println("Enter values of a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Help h1=new Help(a, b);
        h1.display();
    }
}
