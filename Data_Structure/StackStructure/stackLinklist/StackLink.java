package StackStructure.stackLinklist;

public class StackLink {
    public static void main(String[] args) {
        stackLinkedlist sll = new stackLinkedlist();
        
        System.out.println("Before");
        sll.push(5);
        sll.push(20);
        sll.push(14);
        sll.showData();
        
        System.out.println("-".repeat(50));
        System.out.println("After");
        sll.pop();
        sll.showData();
    }
}
