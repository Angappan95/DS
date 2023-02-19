package com.learning.ds.array.practice;

import java.util.ArrayList;

public class Subsequence {
    public static void printSubsequence(int[] arr, int index, ArrayList<Integer> ds) {
        if (index == arr.length) {
            System.out.println(ds.toString());
            return;
        }
        ds.add(arr[index]);
        printSubsequence(arr, index + 1, ds);
        ds.remove(ds.size() - 1);
        printSubsequence(arr, index + 1, ds);
    }

    public static void getSubsequence(int[] arr, int index, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            result.add((ArrayList<Integer>) ds.clone());
            return;
        }
        ds.add(arr[index]);
        getSubsequence(arr, index + 1, ds, result);
        ds.remove(ds.size() - 1);
        getSubsequence(arr, index + 1, ds, result);
    }

    public static void main(String[] args) {
//        Printing subsequence
//        printSubSet(new int[] {1, 2, 3, 4}, 0, new ArrayList<>());

//        Generate Subsequnce - return result
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        getSubsequence(new int[]{1, 2, 3}, 0, new ArrayList<>(), result);
        for (ArrayList<Integer> item : result) {
            System.out.println(item.toString());
        }
    }
}
