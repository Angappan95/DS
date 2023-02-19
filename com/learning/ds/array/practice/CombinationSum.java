package com.learning.ds.array.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CombinationSum {
    // With Duplicate pairs
    public static void computeCombination(int index, int[] arr, int target, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (target == 0) {
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            computeCombination(index, arr, target - arr[index], ds, result);
            ds.remove(ds.size() - 1);
        }
        computeCombination(index + 1, arr, target, ds, result);
    }

    // Unique pairs - Brute Force - using HashSet
    public static void computeUniqueCombination(int index, int[] arr, int target, ArrayList<Integer> ds, Set<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (target == 0) {
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            computeUniqueCombination(index, arr, target - arr[index], ds, result);
            ds.remove(ds.size() - 1);
        }
        computeUniqueCombination(index + 1, arr, target, ds, result);
    }

    // Unique pairs
    public static void computeUniqueCombinarion1(int index, int[] arr, int target, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result){

    }

    public static void main(String[] args) {
//        int[] arr = {2, 5, 2, 7, 6, 7};
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        computeCombination(0, arr, 7, new ArrayList<>(), result);
//        for (ArrayList<Integer> temp : result) {
//            System.out.println(temp.toString());
//        }
        int[] arr = {2, 5, 2, 7, 6, 5};
        Arrays.sort(arr);
        Set<ArrayList<Integer>> uniqueResult = new HashSet<>();
        computeUniqueCombination(0, arr, 7, new ArrayList<>(), uniqueResult);
        for(ArrayList<Integer> temp: uniqueResult){
            System.out.println(temp.toString());
        }
    }
}
