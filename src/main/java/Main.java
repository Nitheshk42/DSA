import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Sum of Arrays
class Arrays1 {

    public static int sumArray(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 34, 22};
        System.out.println(sumArray(nums));
    }

}

//Find max of all elements
class Arrays2{
    public static int maxArray(int[] nums){
        int max = 3;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }return max;
    }
    public static void main(String[] args){
        int[] nums = {3, 6, 34, 22};
        System.out.println(maxArray(nums));
        int[] nums1 = { 34, 24, 67,88};
        System.out.println(maxArray(nums1));
    }
    }

//find the target number in elements:
class Arrays3{
    public static boolean findArray(int[] nums, int target){
        for(int i=0; i< nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        } return false;
    }
    public static void main(String[] args){
        int[] nums ={ 3, 5, 4, 6, 8};
        System.out.println(findArray(nums, 4));
        int[] nums1 ={5, 0, 4, 2, 3};
        System.out.println(findArray(nums1, 8));
        int[] nums2 ={5, 0, 4, 2, 3};
        System.out.println(findArray(nums2, 3));
    }
}

//find the SingleNumber using XOR pattern
//if same a ^ a = 0 (cancels)
//if 1 a ^ 0 = a (unique)
class Arrays4{
        public static int singleNumber(int[] nums) {
            int result = 0;
            for(int i=0; i<nums.length; i++){
                result = result ^ nums[i];

            }  return result;
        }

        public static void main(String[] args){
            int[] nums = {2, 2, 1};
            System.out.println(singleNumber(nums));
            int[] nums1 = {4, 1, 2, 1, 2};
            System.out.println(singleNumber(nums1));
        }
    }
//Median of two sorted array
class Arrays5{
        public static void main(String[] args) {
            int[] nums1 = {1, 5, 8, 11};
            int[] nums2 = {12, 10, 6, 4, 1};

            int[] combined = new int[nums1.length + nums2.length];
            System.arraycopy(nums1, 0, combined, 0, nums1.length);
            System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);

            Arrays.sort(combined);

            double median;
            int n = combined.length;
            if (n % 2 == 1) {
                median = combined[n/2];
            } else  {
                median = (combined[n/2 - 1] + combined[n/2]) / 2.0;
            }
            System.out.println("Median is: " + median);
        }
        public static void sort(int[] combined) {
            sort(combined);
        }
}
//pattern name:- Adjacent Comparison/Two pointers
//Contains Duplicates. 02/06/2026
class Arrays6{
    public static boolean containsDuplicate(int[] nums) {
        //  Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }

        }return false;
    }
    public static void main(String[] args){
        int[] nums={1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(containsDuplicate(nums2));
    }
}
//pattern name:- Brute force
/// Two Sums.    02/06/2026
class Arrays7 {
        public static int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }return new int[]{};
        }
        public static void main(String[] args){
            int[] nums={2, 7, 11, 15};
            int[] result = twoSum(nums, 9);
            System.out.println(result[0] + " " + result[1]);
            int[] nums1 = {2, 7};
            int[] result1 = twoSum(nums1, 9);
            System.out.println(result1[0] + " , " + result1[1]);
        }
    }

//majorityElement Brute force
class Arrays8{
    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length/ 2) {
                return nums[i];
            }

        }return 0;
    }
        public static void main(String[] args) {
        int[] nums = {2, 2, 3};
        System.out.println(majorityElement(nums));
    }

    }
    //ThreeSum with Brute force
    class Arrays9{
        public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> sum = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    for(int k=j+1; k<nums.length; k++){
                        if(nums[i] +nums [j] + nums[k] == 0){
                            sum.add((Arrays.asList(nums[i], nums[j], nums[k])));
                        }
                    }
                }
            }return sum;
        }
        public static void main(String[] args){
            int[] nums = {-1, 0, 1, 2, -1, -4};
            System.out.println((threeSum(nums)));
        }
    }

    //ThreeSum with optimized loop
class Array10 {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> sum = new ArrayList<>();
                Arrays.sort(nums);  // Step 1: Sort array
                for(int i = 0; i < nums.length - 2; i++) {
                    if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i
                    int left = i + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        int total = nums[i] + nums[left] + nums[right];
                        if (total == 0) {
                            sum.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            // skip duplicates
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            left++;
                            right--;
                        } else if (total < 0) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }return sum;
            }

            public static void main(String[] args){
                int[] nums = {-1, 0, 1, 2, -1, -4};
                System.out.println(threeSum(nums));
            }
        }