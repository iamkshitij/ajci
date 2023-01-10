import java.util.Arrays;

class MergeSortedArray{
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5,7};
        int[] result = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int s1 = arr1.length;
        int s2 = arr2.length;

        int[] resultantArray = new int[s1+s2];

        int i=0, j=0, k=0;

        while(i < s1 && j < s2){
                if(arr1[i] < arr2[j])
                    resultantArray[k++] = arr1[i++];
                else
                    resultantArray[k++] = arr2[j++];
        }

        while(i < s1)
            resultantArray[k++] = arr1[i++];
        while(j < s2)    
            resultantArray[k++] = arr1[i++];



        return resultantArray;
    }
}