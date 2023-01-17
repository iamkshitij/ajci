import java.util.Arrays;
import java.util.HashMap;

public class CheckFirstUnique {
    public static void main(String[] args) {
        int[] arr = {2, 54, 7, 2, 6, 54};

        System.out.println("Array: " + Arrays.toString(arr));

        int unique = findFirstUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }

    public static int findFirstUnique(int[] arr){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i])+1;
                hashMap.put(arr[i],count);
            }else
                hashMap.put(arr[i],0);
        }

        for (int i = 0; i < arr.length; i++) {
            if(hashMap.get(arr[i]) == 0)
                return arr[i];
        }

        return -1;
    }
}
