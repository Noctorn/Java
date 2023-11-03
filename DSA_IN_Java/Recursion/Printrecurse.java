package DSA_IN_Java.Recursion;

class Num{
    public void Number(int i){
        if(i>9){
            return;
        }
        // forward recursive statement
        System.out.print(i+" ");
        Number(i+1);
        // backward recur
        System.out.print(i+" ");
        return ;
    }
}
public class Printrecurse {
    public static void main(String[] args) {
        Num n1=new Num();
        n1.Number(0);
    }
}
