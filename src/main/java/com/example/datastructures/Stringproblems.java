package com.example.datastructures;

import java.util.Arrays;
import java.util.Scanner;

import static org.apache.commons.lang.StringUtils.split;

class stringProblems {
    public static boolean anagram(String s, String t) {
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

//How to Read and Print an Integer Value in Java

class StringProblems2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String x = sc.nextLine();
        System.out.println(x);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n);
    }
}
//Palindrome
class StringProblems3 {
    public static boolean isPalindrome(String s) {
       s = s.toLowerCase();
       s = s.replaceAll("[^A-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] arg){
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
        String s1 = "Tab a Cat";
        System.out.println(isPalindrome(s1));
    }
}
//
class StringProblems4 {
    public static void main(String[] args) {
        String s1="java";
        String s2="ja" + "va";
        System.out.println(s1 == s2);
    }
}

//palindrome number
class StringProblem5{
    public static boolean isPalindrome(int n){
        String y = String.valueOf(n);
        int left = 0;
        int right = y.length() -1;
        while(left < right){
            if(y.charAt(left) != y.charAt(right)){
                return false;
            }left++;
            right--;
        }return true;
    }
    public static void main(String[] args){
        int n = 1234;
        System.out.println(isPalindrome(n));
        int n1 = 121;
        System.out.println(isPalindrome(n1));
    }
}
