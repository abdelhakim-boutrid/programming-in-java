
package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import java.util.Arrays;

public class ArrayBasedImpl implements StackOfInts {

    private int[] elements = new int[10];
    private int numOfElems = 0;

    @Override
    public void push(int x) {
        if (numOfElems == elements.length) {
            elements = Arrays.copyOf(
                    elements, elements.length * 2
            );
        }

        elements[numOfElems++] = x;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Cannot pop from an empty stack"
            );
        }

        return elements[--numOfElems];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Cannot peek an empty stack"
            );
        }

        return elements[numOfElems - 1];
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }
}
