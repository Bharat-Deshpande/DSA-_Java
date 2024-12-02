package LinkedList;

import java.util.LinkedList;

public class linkedlist {

    private Node head;
    private Node tail;
    private int size;
    public linkedlist(){
        this.size = 0 ;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if(index ==0 ){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        node.next = temp.next.next;
        size++;
    }


    // insert using recursion
//    public void insertRec(int val, int index){
//        head = insertRec(val,index,head);
//    }
//    private Node insertRec(int val, int index, Node node){
//        if (index == 0){
//            Node temp = new Node(val,node);
//            size++;
//            return temp;
//        }
//        node.next = insertRec(val,index--,node.next);
//        return node;
//    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private  int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //questions
    // remove duplicates
    public void duplicates(){
        Node node = head;
        while(node.next!= null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    //Merge Two sorted lists
    public static linkedlist mergeTwoSortedList(linkedlist first, linkedlist second){
        Node f = first.head;
        Node s = second.head;
        linkedlist ans = new linkedlist();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;

    }

    //LinkedList cycle detection
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }


    //Length of a cycle in a linked list
    public int findCycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }





    public static void main(String[] args) {
       linkedlist first = new linkedlist();
       linkedlist second = new linkedlist();

       first.insertLast(1);
       first.insertLast(3);
       first.insertLast(5);

       second.insertLast(1);
       second.insertLast(2);
       second.insertLast(9);
       second.insertLast(14);

       linkedlist ans = linkedlist.mergeTwoSortedList(first,second);
       ans.display();

    }
}


