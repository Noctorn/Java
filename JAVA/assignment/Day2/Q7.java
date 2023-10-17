// 7. Write a java program to search given element is present in and array and print its position.

package Day2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to search");
    int num=sc.nextInt();
    int arr[]={1,2,3,4,5,6,7,8,9};
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            System.out.print("The position of the number "+num+" is "+(i+1));
        }
    }
    sc.close();
}   
}
