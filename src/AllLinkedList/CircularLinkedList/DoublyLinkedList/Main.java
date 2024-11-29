package AllLinkedList.CircularLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(45);
        list.insertLast(99);
        list.insert(7,88);
        list.display();
    }
}
