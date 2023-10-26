package Day5.Assignment2.Question1;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        int count=0;
        int flag=1;
        System.out.println("Welcome to the snacks shop");
        Scanner sc = new Scanner(System.in);
        System.out.print("To choose Fruit snack enter '1', enter '2' for salty snack: ");
        int snackChoice=sc.nextInt();
        if(snackChoice==1){
            System.out.println("Enter the size you want? 'S','M','L' :");
            char size=sc.next().charAt(0);
            System.out.println("Do you want add sitrus flavour? Enter '0' if you dont want.Else enter the number of citrus you want:  ");
            count=sc.nextInt();
            if(count==0){
                Snacks s1 = new FruitSnacks(snackChoice, size,flag , 0);
                s1.display();
            }else{
                flag=2;
                Snacks s1 = new FruitSnacks(snackChoice, size,flag , count);
                s1.display();
            }
        }else if(snackChoice==2){
             System.out.println("Enter the size you want? 'S','M','L' :");
            char size=sc.next().charAt(0);
            System.out.println("Do you want add nut flavour? Enter '0' if you dont want. Else enter the count of nuts: ");
            count=sc.nextInt();
            if(count==0){
                Snacks s1 = new SaltySnacks(snackChoice, size,flag , 0);
                s1.display();
            }else{
                flag=2;
                Snacks s1 = new SaltySnacks(snackChoice, size,flag , count);
                s1.display();
            }
        }
        sc.close();
    }
}
