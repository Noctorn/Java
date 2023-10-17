// 6. Write a java program to find find Divisors of a given number.

package Day2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        for(i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
