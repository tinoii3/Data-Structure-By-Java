package Data_Structure.LinkedList;

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
    
    public String searchPosition(int position) {
        if(position < 0 || position > size) {
            return null; // Invalid position
        }
        
        System.out.println("Searching for the node...");
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        
        return "Result : Data is "+current.getData()+ " &&  Next to "+current.getNext(); // Return the node at the specified position
    }
    
    public void insertPosition(String data, int position) {
        if (position < 0 || position > size) {
        System.out.println("Invalid position");
        return;
        }
        
        System.out.println("You insert in Position : "+position);
        Node newNode = new Node(data, null);
        if(position == 0) { // Insert at the beginning
            newNode.setNext(head);
            head = newNode;
            
            if(tail == null) {
                tail = newNode; // Update tail if the list was empty
            }
            
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
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
            head = head.getNext(); // Move the head to the next node
            size--; // Decrease the size of the linked list
            
            if(head == null) {
                tail = null; // If the list becomes empty, also update the tail to null
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
        while(current.getNext() != tail) { // loop the list until the node before the last node (tail) is reached
            current = current.getNext();
        }
        
        current.setNext(null); // Update tail to the new last node
        tail = current; // Update tail to the new last node
        size--;
    }
    
    public void removePosition(int position) {
        System.out.println("Remove node "+position+" in linked list.");
        
        if(position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        
        if (position == 0) {
            head = head.getNext();
            size--;
            return;
        }
        
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
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
        
        /*Node aNode = new Node("A");
        System.out.println(aNode.getNext());
        System.out.println("Address of Node A is : "+aNode);
        
        Node bNode = new Node("B", aNode);
        System.out.println("Node B link to "+bNode.getNext());
        */
        Linklist list = new Linklist();
        
        list.insertFirst("D");
        list.insertFirst("C");
        list.insertFirst("B");
        list.insertFirst("A");
        //System.out.println("Head of list is "+list.head);
        //System.out.println("Tail of list is "+list.tail);
        /*
        System.out.println("----------------------------------------");
        
        list.insertLast("A");
        list.insertLast("B");
        list.insertLast("G");
        System.out.println("Head of list is " +list.head);
        System.out.println("Tail of list is " +list.tail);
        System.out.println("Size of list is " +list.size);
        */
        System.out.println("Before".toUpperCase());
        list.showData();
        System.out.println("-".repeat(50));
        System.out.println("After".toUpperCase());
        //System.out.println(list.searchPosition(2));
        
        //list.insertPosition("M", 3);
        //list.removeFirst();
        list.removePosition(3);
        list.showData();
        
    }
    
}
