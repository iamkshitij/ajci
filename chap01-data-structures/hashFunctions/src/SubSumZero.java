import java.util.HashMap;

public class SubSumZero {
    public static void main(String[] args) {

        int[] arr = {6, 0,1, 7, 3, -12, 9};
        System.out.println(findSubZero(arr));
    }

    public static boolean findSubZero(int[] arr){

        int sum = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            // if either sum or arr at 'i'th index = 0 or sum is already contained in hashmap return true
            if(sum==0 || arr[i] == 0 || hashMap.get(sum) != null ) return true;
            hashMap.put(sum,i);
        }

        return false;
    }

}
