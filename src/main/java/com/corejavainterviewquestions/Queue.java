package com.corejavainterviewquestions;


import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue {
    Stack<String> stackOne = new Stack();
    Stack<String> stackTwo = new Stack();

    public void add(String item) {
        stackOne.push(item);
    }

    public String remove() {
        if(stackOne.isEmpty())
            throw new NoSuchElementException("The Queue Is Empty");

        swapStacks(stackOne, stackTwo);
        String result = stackTwo.pop();
        swapStacks(stackTwo, stackOne);
        return result;
    }

    private void swapStacks(Stack<String> stackOne, Stack<String> stackTwo) {
        while(!stackOne.isEmpty()) stackTwo.push(stackOne.pop());
    }
}
