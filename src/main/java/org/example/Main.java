package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] num = {7 , 9  , 1, 0 , 4 , 10};
        insertionSort(num);
        System.out.println(Arrays.toString(num));
        String paragraph = "A short paragraph is a group of related sentences" +
                " that develop a single, specific idea, often between three to five sentences long";
        System.out.println(findLongest(paragraph));
        String para = "Java is a powerful programming language";

        String longest = "";
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < para.length(); i++) {
            char ch = para.charAt(i);

            if (ch != ' ') {
                current.append(ch);
            } else {
                if (current.length() > longest.length()) {
                    longest = current.toString();
                }
                current.setLength(0); // reset
            }
        }

        // Check last word (if paragraph doesn't end with space)
        if (current.length() > longest.length()) {
            longest = current.toString();
        }

//        System.out.println("Longest Word: " + longest);
//        System.out.println("Length: " + longest.length());

        int[] arr1 = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int[] arr = {1, 2, 5, 7, 9};
//        System.out.println(map);
//        System.out.println(evenSumSubarray(arr));
        int[] arr9 = { 1 , 1 , 2 , 3 , 4 , 5};
        removeDuplicates(arr9);
    }

//    public static int[] evenSumSubarray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum % 2 == 0) {
//                    for (int k = i; k <= j; k++) {
//
//                    }
//                }
//            }
//        }
//        return ;
//    }

    public static int removeDuplicates(int[] nums){
        Set<Integer> mp = new LinkedHashSet<>();
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(mp.contains(nums[i])){
                mp.add(nums[i]);
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
    public static int findLongest(String para){
        String[] words = para.split(" ");
        int maxLen = 0;

        for (String w : words) {
            if (w.length() > maxLen)
                maxLen = w.length();
        }
        return maxLen;

//        String longest = "";
//        StringBuilder sb = new StringBuilder();
//        abcabcbb
    }

//    public static int countEvenSum(int[] nums){
//        HashMap<Integer ,Integer> hm = new HashMap<>();
//        int sum = 0;
//        for(int res : nums){
//
//        }
//    }

//    String str = "What is your name";
//    for (int i = 0; i < str.length(); i++) {
//        if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
//                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
//                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
//                || s.charAt(i) == 'O'
//                || s.charAt(i) == 'U') {
//            continue;
//        }
//        else {
//            System.out.print(s.charAt(i));
//        }

    public static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[j] > nums[j-1]){
                    int temp = nums[j];
                    nums[j] =  nums[j - 1];
                    nums[j-1] = temp;
                }
            }
        }
    }

}
