public class Queue {
    public static void main(String[] args) {
        
        qArray qa = new qArray(8);
        for (int i = 2; i < 6; i++) {
            qa.enQueue(i);
        }
        qa.showData();
        qa.deQueue();
        qa.showData();
    }
}