//Sum of Arrays
class Arrays {

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
class Arrays1{
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
class Arrays2{
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