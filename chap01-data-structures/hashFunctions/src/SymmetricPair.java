import java.util.HashMap;

public class SymmetricPair {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5},{4,9}};
        String symmetric = findSymmetricPair(arr);
        System.out.println(symmetric);
    }

    private static String findSymmetricPair(int[][] arr){
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer value = hashMap.get(second);

            if(value != null && value == first)
                result += "{" + second + "," + first + "}";
            else
                hashMap.put(first,second);
        }

        return result;
    }
}
