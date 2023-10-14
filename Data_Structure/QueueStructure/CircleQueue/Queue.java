package CircleQueue;

public class Queue {

    public static void main(String[] args) {
        qArray qa = new qArray(4);
    
        qa.enQueue(10);
        qa.enQueue(15);
        qa.enQueue(25);
        qa.enQueue(35);
    
        qa.showData();
    
        qa.deQueue();
        qa.showData();

        qa.enQueue(20);
        qa.showData();

        qa.enQueue(30);
    }
}
