// 4. Write a program to check number is palindrome or not.
public class Q4 {
    public static void main(String[] args) {
        int i,rem,j,k=0;
        i=121;
        j=i;
        while(i!=0){
            rem=i%10;
            k=k*10 + rem;
            i=i/10;
        }
        if(k==j)
        {
            System.out.println(k+" is a palindrome number");
        }
        else{
            System.out.println(k+" is not a palindrome number");
        }
    }
}
