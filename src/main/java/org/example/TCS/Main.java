package org.example.TCS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(smallest(arr));
        System.out.println(largest(arr));
        System.out.println(secondSmallest(arr));
        System.out.println(secondLargest(arr));
        test.reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static int smallest(int[] nums) {
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static int largest(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int secondSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                secondsmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < secondsmallest && nums[i] != smallest) {
                secondsmallest = nums[i];
            }
        }
        return secondsmallest;
    }

    public static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondlargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondlargest && nums[i] != largest) {
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }

    public static void countFreq(int[] nums){
        Map<Integer , Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num , freq.getOrDefault(freq,0) + 1);
        }

    }

}
    class Test{
        public void reverse(int[] arr){
            int start = 0 , end = arr.length - 1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }


