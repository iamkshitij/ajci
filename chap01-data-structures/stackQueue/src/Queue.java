public class Queue<V> {
    private int maxSize;
    private int currentSize;
    private V[] arr;
    private int front;
    private int back;

    Queue(int maxSize){
        this.maxSize = maxSize;
        front = 0;
        back = -1;
        arr = (V[]) new Object[maxSize];
        currentSize = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public V top(){
        return arr[front];
    }

    public void enqueue(V v){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        back = (back + 1) % maxSize; //to keep the index in range
        arr[back] = v;
        currentSize++;
    }

    public V dequeue(){
        if(isEmpty()) return null;

        V poppedValue = arr[front];
        front = (front + 1) % maxSize;
        currentSize --;
        return poppedValue;
    }
}
