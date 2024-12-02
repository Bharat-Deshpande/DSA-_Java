package LinkedList;

import java.util.HashMap;

public class Main{
     public static void main(String[] args) {
         linkedlist list = new linkedlist();
         list.insertFirst(3);
         list.insertLast(17);
         list.insertLast(18);
         list.insertLast(19);
         list.insertLast(20);
         list.display();
         System.out.println(list.deleteFirst());
         list.display();
         System.out.println(list.deleteLast());
         list.display();
         list.delete(1);
         list.display();

         System.out.println(list.find(8));
         list.insert(88,2);
         list.display();




     }
 }
