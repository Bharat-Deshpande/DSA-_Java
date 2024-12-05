package StackAndQueue.Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) throws StackException{
//        CustomImplemnetation stack = new CustomImplemnetation(5);
//        stack.push(38);
//        stack.push(36);
//        stack.push(35);
//        stack.push(33);
//        stack.push(32);
//        stack.push(31);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
        DynamicStack stack = new DynamicStack(5);
        stack.push(38);
        stack.push(36);
        stack.push(35);
        stack.push(33);
        stack.push(32);
        stack.push(31);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
