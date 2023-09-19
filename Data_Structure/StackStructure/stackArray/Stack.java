package StackStructure.stackArray;

public class Stack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(2);
        stack.pushStack(42);
        stack.pushStack(38);
        stack.showData();
        stack.topStack();
        stack.popStack();
        stack.showData();
        stack.topStack();
    }
}
