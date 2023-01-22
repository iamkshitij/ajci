public class FirstNBinary {
    public static void main(String[] args) {
        int input = 5;
        var result = findBin(input);
        for (String str:
             result) {
            System.out.print(str+ " ");
        }
    }

    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> queue = new Queue<>(number+1);
        queue.enqueue("1");
        for (int i = 0; i < number; i++) {
            result[i] = queue.dequeue();
            String s1 = result[i]+"0";
            String s2 = result[i]+"1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }
        return result; //For number = 3 , result = {"1","10","11"};
    }

}
