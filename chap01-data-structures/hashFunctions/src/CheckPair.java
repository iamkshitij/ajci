import java.util.HashMap;
import java.util.HashSet;

public class CheckPair {
    public static void main(String[] args) {
        int[] arr = {3,4,7,1,12,9};
        System.out.println(findPair(arr));
    }

    public static String findPair(int[] arr) {

        String result = "";

        HashMap<Integer,int[]> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];

                if(!hashMap.containsKey(sum)){
                    hashMap.put(sum, new int[]{arr[i],arr[j]});
                }else {
                    int[] prev_pair = hashMap.get(sum);
                    result += "{" + prev_pair[0] + "," + prev_pair[1] + "} {" + arr[i] + "," + arr[j] + "}";
                    return result;
                }
            }
        }


        return result;
    }
}
