package StackStructure.stackArray;

class ArrayStack {
    private int size;
    private long[] stackArr;
    private int top = -1;
    private int data;
    
    public ArrayStack(int data) {
        size = data;
        stackArr = new long[size];
        top = -1;
    }
    
    public void pushStack(int data) {
        top++;
        System.out.println("Pushing : "+data);
        stackArr[top] = data;
    }
    
    public int popStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            long data = stackArr[top];
            stackArr[top] = 0;
            top--;
            System.out.println("Poping data : "+data);
        }
        return data;
    }
    
    public long topStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top data : " +stackArr[top]);
        }
        return stackArr[top];
    }
    
    public boolean isEmpty() {
        return true;
        
    }
    
    public void showData() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = stackArr.length; i > stackArr.length; i--) {
                System.out.println(stackArr[i]);
            }
        }
        
    }
    
}