package com.example.datastructures;

import java.util.HashSet;
import java.util.HashMap;

//Contains Duplicates using HashSet
class Solution {
    public static boolean hasDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (seen.contains(i)) {
                return true;
            }
            seen.add(i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 2, 5, 6, 7, 8,};
        System.out.println(hasDuplicates(nums));
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(hasDuplicates(nums2));
    }
}

//Two Sums using HashMap
/*class Solution2 {
    public static int twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            if(sum.containsKey(result)){
                return new int[] {sum.get(result) ,i};
            }sum.put(nums[i], i);
        }return new int[] {};
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 9, 1, 11, 12};
        System.out.println(twoSum(nums, 9));
    }
}*/

//majorityElement with HashSet
class Solution2 {
    public static int majorityElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.contains(nums[i])) {
                return nums[i];
            }
        }return 0;
    }
    public static void main(String[] args){
        int[] nums = {3, 4, 3, 4, 4, 3, 3, 3};
        System.out.println(majorityElement(nums));
    }
}
