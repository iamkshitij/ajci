public class HashFunctions {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int key = 94;
        var key1 = 345678;
        int index = hashModular(key,10);
        int indexT = hashTruncation(key1);
        var key2 = 84;
        var index2 = hashModular(key2,10);
        System.out.println("index from hashing :"+index);
        System.out.println("index2 from hashing :"+index2);
        System.out.println("index from truncation :"+indexT);
    }

    public static int hashTruncation(int key){
        return key % 5000;
    }
    public static int hashModular(int key, int size){
        return key % size;
    }



}
