import java.util.Arrays;

class ProductArray{
    public static void main(String[] args) {
        int[] sample1 = {1,-2,3,0,5};
        System.out.println("Before Product\n"+Arrays.toString(sample1));
        System.out.println("After Produt\n"+Arrays.toString(productExceptSelfDivision(sample1)));
    }

    public static int[] productExceptSelfDivision(int[] nums){
        int mul = 1, countZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                countZero++;
            } else {
                mul *= nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(countZero != 0) {
                if(nums[i] == 0) nums[i] = mul;
                else nums[i] = 0;
            } else {
                nums[i] = mul / nums[i];
            }
        }
        return nums;
    }

    public static int[] productExceptSelf(int[] nums){
        // calculate size of input array
        int sizeOfNums = nums.length;

        // left sub array of size of nums
        int[] leftSubArray = new int[sizeOfNums];
        // initalize left sub array 0 index -> 1
        leftSubArray[0] = 1;

        // calculate left sub array
        for (int i = 1; i < sizeOfNums; i++) {
            leftSubArray[i] = leftSubArray[i-1] * nums[i-1];
        }

        // right sub array of size of nums
        int[] rightSubArray = new int[sizeOfNums];
        // initialize rightmost value of array to 1
        rightSubArray[sizeOfNums - 1] =  1;

        // calculate right sub array
        for (int i = sizeOfNums - 2; i >= 0; i--) {
            rightSubArray[i] = rightSubArray[i+1] * nums[i+1];
        }

        // calculate resultant as product of left and right sub array
        for (int i = 0; i < sizeOfNums; i++) {
            nums[i] = rightSubArray[i] * leftSubArray[i];
        }


        return nums;
    }

}