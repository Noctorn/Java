package DSA_in_java.QueueDs;

public class UserLinearQueue {
    public static void main(String[] args) {
        LinearQueue lq = new LinearQueue();
        for (int i = 0; i < 10; i++) {
            lq.Enque(i);
        }
        lq.display();
        System.out.println();
        lq.deque();
        lq.display();
        System.out.println();
        lq.Enque(10);
        lq.display();
        System.out.println();
        lq.deque();
        lq.display();
        // System.out.println();
        // lq.Enque(11);
        // lq.display();
    }
}
