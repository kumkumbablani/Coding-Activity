package org.example.TCS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo {
    public static String capitalize(String str) {
        if (str == null || str.length() == 0)
            return str;

        char[] ch = str.toCharArray();

        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char)(ch[0] - 32);

        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ' ' && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }

        return new String(ch);
    }

    public static String compress(String s) {
        if (s == null || s.length() == 0) return s;

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {

            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(s.charAt(s.length()-1)).append(count);
        return result.toString();
    }

    public static String removeDuplicates(String s){
        HashSet<Character> exists = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for (char c: s.toCharArray()) {
            if(!exists.contains(c)){
                ans.append(c);
                exists.add(c);
            }
        }
        return ans.toString();
    }

    public static int[] maxFreq(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int n: arr) {
            freq.put(n , freq.getOrDefault(n ,0) + 1);
        }
        int maxfreq = 0;
        int element = -1;
        for (Map.Entry<Integer , Integer> entry : freq.entrySet()){
            if(entry.getValue() > maxfreq){
                maxfreq = entry.getValue();
                element = entry.getKey();
            }
        }
//        System.out.println(maxfreq);
//        System.out.println(element);
        return new int[]{element , maxfreq};
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseSentence(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String testString1 = "i love you";
        String testString2 = "java";
        String testString3 = "already Capital";
        System.out.println(capitalize(testString1));
        String s = "java is fun";
        String result = "";
        int[] ans = {5 , 5 , 8 , 5 , 4 , 3 , 1};
        int[] res = maxFreq(ans);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
        System.out.println(compress("uytgggfffdd"));
        System.out.println(removeDuplicates("aaaaabbbbbyttttt"));
        System.out.println(Arrays.stream(res).max());
        System.out.println(reverseWords(testString1));
        System.out.println(reverseSentence(testString1));
    }
}
