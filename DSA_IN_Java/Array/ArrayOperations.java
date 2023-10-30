package DSA_IN_Java.Array;

import java.util.Scanner;

public class ArrayOperations {
    private int arr[];
    
    public ArrayOperations(){
        // this is the default constructor
        arr=new int[5+1];
    }
    public ArrayOperations(int range){
        // this is the constructor for given range
        arr=new int[range+1];
    }
    public void ReadArrayElements(){
        // reading user input
        Scanner sc=new Scanner(System.in);
        int i;
        for( i=0;i<arr.length-1;i++){
            System.out.println("Enter an element: (-999 to exit)");
            arr[i]=sc.nextInt();
            if(arr[i]==-999){
                break;
            }
        }
        arr[i]=-999;
        sc.close();
    }
    public void displayArrayElemetns(){
        // displaying the array elements 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-999){
                break;
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void LeftShift(){
        // performing leftshift operations
        int i;
        for(i=0;arr[i]!=-999;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=0;
    }
    public void RightShift(){
        // performing rightshift operations
        int i;
        for(i=0;arr[i]!=-999;i++);
        for(i=i-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=0;
    }
    public void LeftRotate(){
        // performing left rotate
        int i,temp;
        temp=arr[0];
        for(i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i-1]=temp;
    }
     public void RightRotate(){
        // performing right rotate
        int i,temp;
        temp=arr[arr.length-2];
        for(i=arr.length-2;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
    }
    public void InsertValueAt(int index,int value){
        int i;
        for(i=arr.length-2;i>index-2;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=value;
    }
    public void DeleteValueAt(int index){
        int i;
        for(i=index-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=-999;
    }
    public void RemoveDuplicatesV1(){
        int temp[]=new int[arr.length];
        boolean flag;
        int i,j,temp_index=-1;
        for(i=0;i<arr.length;i++){
            flag=false;
            for(j=0;j<=temp_index;j++){
                if(arr[i]==temp[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                temp_index++;
                temp[temp_index]=arr[i];
            }
        }
        temp[temp_index]=-999;
        arr=temp;
    }
    public void RemoveDuplicatesV2(){
        int i,j;
        for(i=0,j=-1;i<arr.length-1;i++){
            for(j=i;arr[j]!=-999;j++){
                if(arr[i]==arr[j]){
                    DeleteValueAt(j+1);
                }
            }
        }
    }
}
