// Last updated: 8/12/2025, 12:40:53 AM
class MyCircularQueue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int data) {
        if (isFull()) return false;
        if (front == -1) front = 0; // only for first element insert
        rear = (rear + 1) % size;
        arr[rear] = data;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        if (front == rear) { // Only one element was present
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1; //if there was some element then rear would contain some +ve value
    }

    public boolean isFull() {
        return ((rear + 1) % size) == front; //Queue is Full if rear is just behind front in circular manner
    }
}
