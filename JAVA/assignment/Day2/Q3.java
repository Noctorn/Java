// Write a program to find largest element in an array.
package Day2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range of array: ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            System.out.print("Enter a number: ");
            arr[0]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<l;i++){
            if(max<arr[i]){
                int t=arr[i];
                arr[i]=max;
                max=t;
            }
        }
        System.out.println("The largest value in the array is: "+max);
        sc.close();

    }
}
