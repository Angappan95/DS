package com.learning.ds.array.subsequence;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumSeq {
    public static void main(String[] args) {
        int arr[] = new int[]{1, -5, 11, 4, 2};
        printSubsequences(arr, new ArrayList<>(), 0, 7, 0);
    }

    public static void printSubsequences(int[] arr, List<Integer> bag, int i, int target, int sum) {
        if (i == arr.length) {
            System.out.println(bag);
        }
        bag.add(arr[i]);
        printSubsequences(arr, bag, i + 1, target, sum + arr[i]);
        bag.remove(bag.size() - 1);
        printSubsequences(arr, bag, i + 1, target, sum);

    }
}
