package LinkedList;

public class Linklist {
    
    private Node head;
    private Node tail;
    private int size;
    
    public void insertFirst(String data){ // method addFirst
        Node newNode;
        
        if(head == null) {
            newNode = new Node(data, null); // If the list is empty, create a new node with null next
        } else {
            newNode = new Node(data, head); // If the list is not empty, create a new node with current head as the next node
        }
        head = newNode; // Set the newly created node as the new head of the linked list
        size++; // Increase the size of the linked list
    }
    
    public void insertLast(String data) { // method addLast
        Node newNode = new Node(data, null);
        if (head == null) { // If the list is empty
            head = newNode; // Make the new node the head of the linked list
        } else {
            tail.setNext(newNode); // Make the next node of the current tail point to the new node
        }
        tail = newNode; // Update the tail to point to the newly added node
        size++;
    }
    
    public void searchPosition(int position) {
        if(position < 0 || position > size) {
            System.out.println("Invalid position"); // Invalid position
        }
        
        System.out.println("Searching for the node "+ position);
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.getNext();
        }
        
        System.out.println("Result : Data is "+current.getData()+ " &&  Next to "+current.getNext()); // Return the node at the specified position
    }
    
    public void insertPosition(String data, int position) {
        if (position <= 0 || position >= size) {
        System.out.println("Invalid position");
        return;
        }
        
        System.out.println("You insert in Position : "+position);
        Node newNode = new Node(data, null);
        if(position == 1) { // Insert at the beginning
            newNode.setNext(head);
            head = newNode;
            
            if(tail == null) {
                tail = newNode; // Update tail if the list was empty
            }
            
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext()); // Set the new node is next to the current node's next
            current.setNext(newNode); // Update the current node is next to the new node
            
            if(position == size) {
                    tail = newNode; // Update tail if inserting at the end
            }
        }
        size++;
    }

    public void removeFirst() {
        System.out.println("Remove first in linked list.");
        
        if(head != null) {
            head = head.getNext();
            size--; 
            
            if(head == null) {
                tail = null; 
            }
        }
    }
    
    public void removeLast() {
        System.out.println("Remove last node in linked list.");
        
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        if(head == tail) { // Only one node in the list
            head = null;
            tail = null;
            size = 0;
            return;
        }
        
        Node current = head;
        Node previous = null; // Add a 'previous' variable to track the node before 'current'
        while (current.getNext() != tail) { // Loop through the list until the node before the last node (tail) is reached
            previous = current;
            current = current.getNext();
        }

        previous.setNext(null); // Update the 'next' of 'previous' to null
        tail = previous; // Update the 'tail' to the previous node instead of 'current'
        size--;
    }
    
    public void removePosition(int position) {
        System.out.println("Remove node "+position+" in linked list.");
        
        if(position <= 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        
        if (position == 1) {
            head = head.getNext();
            size--;
            return;
        }
        
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.getNext();
        }

        Node nodeDelete = current.getNext();
        if (nodeDelete == tail) {
            tail = current;
        }
        
        current.setNext(nodeDelete.getNext());
        size-- ;
    }
    
    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getSize(){
        return size;
    }
    
    public void showData() {
        if(head == null) {
            System.out.println("No Data in Linkedlist");
        } else {
            System.out.println("Size of the linked list "+size);
            Node current = head;
            int round = 0;
            
            for(int i = 0; i < size; i++) {
                round++;
                System.out.println("Data "+round + " is "+current.getData()+ " && Next to "+current.getNext());
                current = current.getNext();
            }
        }
    }
    
    public static void main(String[] args) {
        

        Linklist list = new Linklist();
        
        list.insertFirst("D");
        list.insertFirst("C");
        list.insertFirst("B");
        list.insertFirst("A");

        System.out.println("Before".toUpperCase());
        list.showData();
        System.out.println("-".repeat(50));
        System.out.println("After".toUpperCase());
        
        //System.out.println(list.searchPosition(2));
        //list.searchPosition(2);
        //list.insertPosition("M", 2);
        //list.removeFirst();
        list.removePosition(3);
        //list.removeLast();
        list.showData();
        //System.out.println(list.getTail());
        
    }
    
}
