package Day5.Assignment1.Question4;

public class Main {
    /* 
     * Human.java class has variables height , weight and bmi which are private.For each variable, there is a setter and getter.Encapsulate the class and obtain output.
     */
    public static void main(String[] args)
    {
        // Human h1=new Human();
        // h1.setHeight(190.5);
        // h1.setWeight(85.34);
        // h1.calculate_bmi();
        // System.out.println(h1.getHeight()+" "+h1.getWeight()+" "+h1.getBmi());
         Human h2=new Human(180, 70);
        //  h2.calculate_bmi();
         System.out.println("Height is: "+h2.getHeight()+" Weight is "+h2.getWeight()+" and your bmi is "+h2.getBmi());
    }   
}