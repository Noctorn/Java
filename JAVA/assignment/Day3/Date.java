package Day3;

public class Date {
    int dd;int mm;int yy;
   Date(int dd,int mm,int yy){
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
   }
   void get_date(){
        System.out.println("The date is "+dd+"/"+mm+"/"+yy);
   }
}
