public class QueueWithStack <V> {

    Stack<V> stack1;
    Stack<V> stack2;

    public QueueWithStack(int maxSize){
        stack1 = new Stack<>(maxSize);
        stack2 = new Stack<>(maxSize);
    }

    public void enqueue(V value){
        stack1.push(value);
    }

    public boolean isEmptyOpt(){
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    public V optDequeue(){
        // optimised solution O(1)
        if(isEmptyOpt()) return null;
        else if (stack2.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            return stack2.pop();
        }else
            return stack2   .pop();

    }

    public V dequeue(){

        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        V result = stack2.pop();

        while (!stack2.isEmpty())
            stack1.push(stack2.pop());




        return result;
    }
    public boolean isEmpty(){
        return stack1.isEmpty();
    }
}