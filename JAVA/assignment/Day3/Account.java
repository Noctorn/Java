package Day3;
public class Account {
    long accout_num;
    String account_type;
    double balance;
     
    Account(long accout_num,String account_type,double balance){
        this.accout_num=accout_num;
        this.account_type=account_type;
        this.balance=balance;

    }
    void get_data(){
        System.out.println("Enter the details of account");
        System.out.println("Account number: "+accout_num+" Account_type "+account_type+"Balance "+balance);
    }
    public static void main(String[] args) {
        // Account a1=new Account();
    }
}
