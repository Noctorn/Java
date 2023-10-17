/* 
 * Create class Bank, write methods savings(),withdrawal(),fixedDeposit()
rate of interest are diffrent for savings and fixed deposits.
Once rate of intereset in changed should be applied to respective accounts.
 */
package Day3;

import java.util.Scanner;

public class Bank {
    private double balance;
    private float rate;
    private double sum;
    Bank(){
        balance=0.00;
        rate=0.00f;
        sum=0.00;
    }
    void get_values(double b,float r){
        balance=b;
        rate =r;
    }
    double savings(double balance,float rate){
        balance=(((balance*rate)/100)+balance);
        return 0.00;
    }
    double fixedDeposit(float rate,float principle,int time){
        sum=Math.pow(principle*(1+(rate/time)),time);
        return 0.00;
    }
    void withdrawal(double amount){
        balance-=amount;
        return;
    }
    void display(){
        System.out.println("The balance is: "+balance);
        System.out.println("The rate of interest is: "+rate);
        System.out.println("The fixed deposite is: "+sum);

    }

    public static void main(String[] args) {
        System.out.println("Enter the values: ");
        Scanner sc=new Scanner(System.in);
        double balac=sc.nextDouble();
        float rt=sc.nextFloat();
        double amount=sc.nextDouble();
        Bank customer=new Bank();
        double z=customer.savings(balac,rt);
        customer.withdrawal(amount);
        System.out.println("Thr balance will be: "+z);
        customer.display();
        sc.close();
    }
}
