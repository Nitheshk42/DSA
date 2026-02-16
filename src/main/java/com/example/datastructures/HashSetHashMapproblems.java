package com.example.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

//Contains Duplicates using HashSet
class Solution {
    public static boolean hasDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);

        }System.out.println("all elements are unique");
        return false;

    }
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 2, 5, 5, 7, 8,};
        System.out.println(hasDuplicates(nums));
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(hasDuplicates(nums1));
    }
}

//Two Sums using HashMap
class Solution2 {
    public static int[] twoSums(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            if(map.containsKey(result)){
                return new int[] { map.get(result) , i};

            } map.put(nums[i],i);

        }return new int[] {};

    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSums(nums, 9)));
    }
}

//majorityElement with HashSet
class Solution3 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {47, 89, 42, 89, 89, 57};
        System.out.println(majorityElement(nums));
    }
}
