package com.learning.ds.array.practice;

public class SlidingWindow {
    public static int maxSubArraySum(int[] arr, int k) {
        int max = 0;

        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int sum = max;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static int maxSubArraySum(int[] arr) {
        int max = 0;
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if(sum > max) max = sum;
            i++;
        }
        return max;
    }
}
