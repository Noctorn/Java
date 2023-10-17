//  Write a java program to convert binary number to decimal.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a binary number ");
            int num=sc.nextInt();
            int sum=0;
            int rem,j=0;
            while(num!=0){
                rem=num%10;
                sum+=rem*(Math.pow(2, j));
                num=num/10;
                j++;
            }
            System.out.println((int)sum);
            sc.close();
} 
}
