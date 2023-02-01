import java.util.Arrays;

public class KLarge {
    public static void main(String[] args) {
        var result = findKth(new int[]{1,2,3,4,5},2);
        System.out.println("K largest elements are: ");

        for (int res: result) System.out.print(res+" ");
    }

    // k largest elements
    public static int[] findKth(int[] arr,int k){
        Arrays.sort(arr);
        int len = arr.length - k;
        int result[] = new int[k];
        int itr = 0;
        for (int i=arr.length;i>len;--i) result[itr++] = arr[i-1];
        return result;
    }
}
