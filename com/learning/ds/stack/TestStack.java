package com.learning.ds.stack;

class Stack{
    private int[] arr  = new int[10];
    private int pointer;

    public void push(int value){
        arr[pointer++] = value;
    }

    public int pop(){
        int temp = arr[pointer];
        pointer--;
        return temp;
    }

    public void printStack(){

    }
}

public class TestStack {
}
