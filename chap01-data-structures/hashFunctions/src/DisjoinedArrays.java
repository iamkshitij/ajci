import java.util.HashSet;

public class DisjoinedArrays {
    public static void main(String[] args) {
        int[] arr1 = {9, 4, 3, 1, -2, 6, 5};
        int[] arr2 = {7, 10, 8};
        int[] arr3 = {1, 12};
        System.out.println(isDisjoint(arr1, arr2));
        System.out.println(isDisjoint(arr1, arr3));
    }

    public static boolean isDisjoint(int[] arr1, int[] arr2){
        HashSet<Integer> hs =  new HashSet<>();

        for (int arr: arr1) {
            if(!hs.contains(arr)) hs.add(arr);
        }

        for (int arr: arr2) {
            if(hs.contains(arr)) return false;
        }

        return true;
    }
}
