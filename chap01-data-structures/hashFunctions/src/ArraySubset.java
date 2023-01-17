import java.util.HashSet;

public class ArraySubset {

    public static void main(String[] args) {

//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {3,7,5};

        int[] arr1 = {9,4,3,1,-2,6,5};
        int[] arr2 = {7,10,8};


        boolean res = isSubset(arr1,arr2);
        System.out.println(res);
    }

    public static boolean isSubset(int[] arr1, int[] arr2){

        HashSet<Integer> hs = new HashSet();

        for (int arr: arr1) {
            if(!hs.contains(arr))
                hs.add(arr);
        }
        for (int arr: arr2) {
            if(!hs.contains(arr)) return false;
        }

        return true;


    }
}
