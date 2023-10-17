// check if the number is prime or not
public class Q3 {
public static void main(String[] args) {
    boolean flag=true;
    int num=8;
    for(int i=2;i<num;i++){
        if(num%i==0){
            flag=false;
            break;
        }
    }
if(flag==true){
    System.out.println("It is a prime number: "+num);
}
else{
    System.out.println("It is not  a prime number: "+num);
}
}
}
