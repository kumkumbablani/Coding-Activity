package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();// read size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {  // read elements
            arr[i] = in.nextInt();
        }

        System.out.println(removeDuplicates(arr , n));
//        in.close();
        System.out.println(sort0s(arr));
    }

    public static int removeDuplicates(int[] nums , int n){
        Set<Integer> set = new LinkedHashSet<>();
        int idx = 0;
        for (int i = 0; i < n; i++){
            if(!set.contains(i)){
                nums[idx++] = nums[i];
            }

        }
        return idx;
    }

    public static boolean sort0s(int[] nums){
        Arrays.sort(nums);
        return false;
    }
}
