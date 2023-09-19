package StackStructure.stackLinklist;

public class stackLinkedlist {
    private Node top;
    private int size;
    
    public stackLinkedlist() {
        top = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(int newItem) {
        top = new Node(newItem, top);
        size++;
    }
    
    public int pop(){
        if(!isEmpty()) {
            Node temp = top;
            top = top.getNext();
            size--;
            return temp.getData(); // getItem ---> getData
        } else {
            return -1;
        }
    }
    
    public int top() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            return -1;
        }
    }
    
    public void showData() {
        Node current = top;
        for (int i = 0; i < size; i++) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
