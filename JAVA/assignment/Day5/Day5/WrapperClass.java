package Day5;

public class WrapperClass {
    public static void main(String[] args) {
        // calling a default wrapper class;
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println("The values will be: "+a+" "+j+" "+i);
        
        // Calling a user defiend wrapper class 
        Random r=new Random(10);

        System.out.println(r.to_String(101));

        System.out.println(r.get_value());
    }
}


/* 
 * This is a user difiend wrapper class
 */
class Random{
    private int i;
    Random(){
        // This is a non param construct
    }
    Random(int i){
        this.i=i;
        // this is a param construct
    }
    public int get_value(){
        // getting values from data member;
        return i;
    }
    public String to_String(int i){
        // converting integer data type into String data type
        return Integer.toString(i);
    }
}
