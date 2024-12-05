package AllLinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.delete(8);
        list.display();
    }
}
