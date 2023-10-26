package Day5.Assignment1.Question5;

public class Main {
    public static void main(String[] args) {
        /*
         * 5.
         * public class PolymorphicAssignment
         * {
         * public static void main(String [] args)
         * {
         * ClassA obj1 = new ClassA();
         * ClassA obj2 = new ClassA();
         * ClassB obj3 = new ClassB();
         * 1) obj1 = obj2; // no problem here...same data types
         * 2) obj1 = obj3; // obj3 is a type of ClassA…ok
         * 3) //obj3 = obj2; // "incompatible types" compile message
         * 4) //obj3 = obj1; // still incompatible as the obj3 value
         * // stored in obj1 (see line 2 above)
         * // has lost its ClassB identity
         * 5) obj3 = (ClassB)obj1; // the ClassB identity of the object
         * // referenced by obj1 has been retrieved!
         * // This is called "downcasting"
         * 6) obj3 = (ClassB)obj2; // This compiles but will not run.
         * // ClassCastException run time error
         * // Unlike obj1 the obj2 object ref. variable
         * // never was a ClassB object to begin with
         * 
         * } // end main
         * }// end class
         * 
         * 
         * Idetify errors in above program.
         * 1.What is wrong with the code in lines 3 and 4 above?
         * 2. Why isn’t line 4 okay? From line 2 aren’t you assigning a ClassB value to
         * a ClassB variable?
         * 3. Lines 5 and 6 are syntactically equivalent. They both compile but line 6
         * will not execute. Why? Explain the difference between those two lines.
         */
    }
}
