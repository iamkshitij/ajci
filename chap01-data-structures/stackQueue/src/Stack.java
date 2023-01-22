import java.util.Arrays;

public class Stack<V> {
    private int maxSize;
    private int top;
    private V[] arr;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        arr = (V[]) new Object[maxSize];
    }

    public int getMaxSize(){
        return maxSize;
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }

    public boolean isFull(){return top == maxSize - 1;}

    public V top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        }

        return arr[top];
    }

    public void printList(){
        System.out.println("Stack");
        for (V v:
             arr) {
            System.out.print(v+"-");
        }
        System.out.println();
    }

    public void push(V value){
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    public V pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return null;
        }
       return arr[top--];
    }

}
