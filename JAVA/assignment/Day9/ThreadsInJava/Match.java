package Day9.ThreadsInJava;

public class Match extends Thread  {
    public void run(){
        try {
            for(int i=1;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<4;i++){
            Match t=new Match();
            t.start();
        }
    }
}
