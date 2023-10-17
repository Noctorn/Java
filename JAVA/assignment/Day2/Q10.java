/*
 * Write a class to calculate fixed deposit of a 
 * customer after 3 years where rate of interest=7.2%.Display the Total amount he will recieve after FD matures.
 */
package Day2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p=sc.nextInt();
        float r=7.2f;
        int time=3;
        float a=0;
        for(int i=0;i<time;i++){
            a+=(p*r)/100;
        }
        System.out.println("The amount payble at the end of 3 years is: "+a);
        sc.close();
    }
}
