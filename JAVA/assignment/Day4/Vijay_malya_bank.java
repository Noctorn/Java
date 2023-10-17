import Day3.Bank;
package Day4;


public class Vijay_malya_bank {
    private double balance;
    private int id;
    Vijay_malya_bank(){
        id++;
    }
    void get_balance(double balance){
        this.balance=balance;
    }
    void deposite(int amount ){
        balance+=amount;
    }
    void display(){
        System.out.println("The balance after deposite is: "+balance+" of account id: "+id);
    }
    public static void main(String[] args) {
        Vijay_malya_bank a1=new Vijay_malya_bank();
        a1.get_balance(34000.47);
        a1.display();
        a1.deposite(25000);
        a1.display();
    }
}
