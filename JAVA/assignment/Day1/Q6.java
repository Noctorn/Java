/*

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

 */
public class Q6 {
    public static void main(String[] args) {
        int k=1;
        for (int i=6;i>0;i--){
            for(int a=1;a<=i;a++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print(k+" ");
            }
            
            System.out.println("");
             k+=1;
        }
       
    }
}

