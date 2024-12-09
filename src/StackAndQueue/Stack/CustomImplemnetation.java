package StackAndQueue.Stack;

import java.util.Stack;

public class CustomImplemnetation {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;


    public CustomImplemnetation(){
        this(DEFAULT_SIZE);
    }

    public CustomImplemnetation(int size) {
        this.data = new int[size];
    }


    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        for(int i = 0; i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length -1; //ptr is at last index
    }
    public boolean isEmpty(){
        return ptr == -1; //ptr is empty
    }

}
