// 1. Write a program to find factorial of a number.
class Q1{
    public static void main(String[] agrs){
        int i,j,fact=1;
        j=5;
        for(i=1;i<=j;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);
    }
}