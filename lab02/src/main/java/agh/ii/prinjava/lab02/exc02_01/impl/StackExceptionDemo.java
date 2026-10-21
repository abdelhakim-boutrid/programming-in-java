
package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class StackExceptionDemo {

    public static void main(String[] args) {
        test(new ArrayBasedImpl(), "Array");
        test(new LinkedListBasedImpl(), "Linked list");
    }

    private static void test(StackOfInts stack, String name) {
        System.out.println("\nTesting: " + name);

        stack.push(10);
        stack.push(20);

        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            stack.peek();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
