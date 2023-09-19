package Queue;
public class qArray {
    private int size;
    private int data;
    private int front;
    private int rear;
    private int[] qarray;

    public qArray(int data) {
        size = data;
        front = -1;
        rear = -1;
        qarray = new int[size];
    }

    public void enQueue(int data) {
        System.out.println("Enqueue data...");
        if (front == (size - 1)) {
            System.out.println("Queue is full!");
        } else {
            rear++;
            qarray[rear] = data;
            System.out.println("Enqueue data to the Queue : "+data);
        }

        if (front == -1) {
            front = 0;
        }
    }

    public int deQueue() {
        System.out.println("Dequeue data...");
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } 

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
            data = qarray[front];
        }

        return data;
    }

    public void showData() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            for (int i = front; i < qarray.length; i++) {
                System.out.println("Queue "+i+" "+qarray[i]);
            }
        }
        System.out.println("-".repeat(50));
    }

    public boolean isEmpty() {
        return rear == -1;
    }
}