package Day4;

import java.util.Scanner;

public class Date {
    private int dd;
    private int mm;
    private int yy;
    Date(int dd,int mm,int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    void get_date(){
        System.out.println("enter date");
        Scanner sc=new Scanner(System.in);
        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yy=sc.nextInt();
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
        sc.close();
    }
    void date_display(){
        System.out.println("The date will be: "+dd+"/"+mm+"/"+yy);
    }
}
