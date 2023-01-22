public class Main {
    public static void main(String[] args) {
//
//        Stack<Integer> stack = new Stack<>(10);
//
//        for (int i = 0; i < 5; i++) stack.push(i);
//        System.out.println("Top -> "+stack.top());
//        stack.pop();

//        TwoStacks<Integer> tS = new TwoStacks<Integer>(5);
//        tS.push1(11);
//        tS.push1(3);
//        tS.push1(7);
//        tS.push2(1);
//        tS.push2(9);

//        System.out.println(tS.pop1());
//        System.out.println(tS.pop2());
//        System.out.println(tS.pop2());
//        System.out.println(tS.pop2());
//        System.out.println(tS.pop1());

        QueueWithStack<Integer> queue = new QueueWithStack<Integer>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.optDequeue());
        System.out.println(queue.optDequeue());
        System.out.println(queue.optDequeue());
        System.out.println(queue.optDequeue());
        System.out.println(queue.optDequeue());
        System.out.println(queue.optDequeue());
    }
}