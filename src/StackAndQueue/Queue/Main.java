package StackAndQueue.Queue;

public class Main {
    public static void main(String[] args) {
//        CustomQueue queue = new CustomQueue(10);
        CircularQueue queue = new CircularQueue(10);
        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.insert(9);
        queue.insert(12);

        queue.display();
        queue.remove();
        queue.display();
    }
}
