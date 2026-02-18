package com.example.datastructures;

import java.util.Arrays;

import static org.apache.commons.lang.StringUtils.split;

class stringProblems {
    public static boolean anagram(String s, String t) {
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = t.length() - 1; j >= 0; j--) {
//                System.out.print((s.charAt(i)));
//            }
//            return false;
//        }
//    }
//    public static void main(String[] args){
//        String s = "Racecar";
//        anagram(s);
        if (s.length() != t.length()) {
            return false;
        }
        char[] sConvert = s.toCharArray();
        char[] tConvert = t.toCharArray();
        Arrays.sort(sConvert);
        Arrays.sort(tConvert);
        if (Arrays.equals(sConvert, tConvert)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "racecar";
        String t = "carrace";
        System.out.println(anagram(s,t));
    }
}

//Check the evenlength of the string
