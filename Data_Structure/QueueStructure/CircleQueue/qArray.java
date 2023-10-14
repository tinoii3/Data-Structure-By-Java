package CircleQueue;
import java.util.Arrays;

public class qArray {
    private int size;
    private int front;
    private int rear;
    private int[] queueArray;

    public qArray(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queueArray = new int[size];
    }

    public void enQueue(int data) {
        System.out.println("Enqueue data...");
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full!");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queueArray[rear] = data;
        }
    }

    public int deQueue() {
        System.out.println("Dequeue data...");
        int data = -1;
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            data = queueArray[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
        return data;
    }

    public void showData() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            if (front <= rear) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(queueArray, front, rear + 1)));
            } else {
                int[] combinedArray = new int[size];
                int count = 0;
                for (int i = front; i < size; i++) {
                    combinedArray[count++] = queueArray[i];
                }
                for (int i = 0; i <= rear; i++) {
                    combinedArray[count++] = queueArray[i];
                }
                System.out.println(Arrays.toString(combinedArray));
            }
        }
        System.out.println("-".repeat(50));
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
}
