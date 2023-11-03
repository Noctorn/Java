package DSA_IN_Java.Recursion;


public class Adding {
    public static void A(int n){
        System.out.print(n+" ");
        if(n>9){
            return;
        }
        B(n);
    }  
    public static void B(int n){
        A(n+1);
    }  
    public static void main(String[] args) {
        A(1);
    }
}
