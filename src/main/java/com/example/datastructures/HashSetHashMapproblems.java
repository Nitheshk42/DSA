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
    public static int twoSum(int[] nums, int target){
       HashMap<Integer, Integer> sum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums.
}*/

//majorityElement with HashSet
class Solution2 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }return 0;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,2,3,2};
        System.out.println(majorityElement(nums));
    }
    }
