package com.neetcode150.stacks.min_stack;


public class MinStack {
private Node head;

public MinStack(){}


    public static void main(String[] args){

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println("Current Min: " + minStack.getMin()); // 3
        minStack.pop();
        System.out.println("Top: " + minStack.top());           // 3
        System.out.println("Current Min: " + minStack.getMin()); // 3
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin());


    }

    private class Node{
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }


    public void push(int val){
        if(head == null){
            head = new Node(val, val, null);
        }else{
            head = new Node(val,Math.min(val,head.min),head);
        }
    }

    public void pop(){
        head = head.next;
    }

    public int top(){
    return head.val;
    }

    public int getMin(){
    return head.min;
    }






}
