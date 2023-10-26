package Day5.Random;

class ABC{
    void displya(float x){
        System.out.println("Class ABC"+x);
    }
}
class DEF extends ABC{
    void displya(int a){
        System.out.println("Class DEF"+a);
    }
}
class GHI extends DEF{
    void displya(float ab){
        System.out.println("class GHI"+ab);
    }
}

public class Overloading {
    public static void main(String[] args) {
        ABC obj1=new GHI();
        obj1.displya(20.2f);
    }
}
