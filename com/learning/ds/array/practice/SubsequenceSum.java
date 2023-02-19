package com.learning.ds.array.practice;

import java.util.ArrayList;

public class SubsequenceSum {

    public static int targetSum(int[] arr, int index, int sum, int target, ArrayList<Integer> ds) {
        if (index == arr.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        ds.add(arr[index]);
        int left = targetSum(arr, index + 1, sum + arr[index], target, ds);
        ds.remove(ds.size() - 1);
        int right = targetSum(arr, index + 1, sum, target, ds);
        return left + right;
    }

    public static int targetSum(int[] arr, int index, int sum, int target, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (sum == target) {
                result.add((ArrayList<Integer>) ds.clone());
                return 1;
            }
            return 0;
        }
        ds.add(arr[index]);
        int left = targetSum(arr, index + 1, sum + arr[index], target, ds, result);
        ds.remove(ds.size() - 1);
        int right = targetSum(arr, index + 1, sum, target, ds, result);
        return left + right;
    }

    public static boolean targetSumFirst(int[] arr, int index, int sum, int target, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (sum == target) {
                result.add((ArrayList<Integer>) ds.clone());
                return true;
            }
            return false;
        }
        ds.add(arr[index]);
        if (targetSumFirst(arr, index + 1, sum + arr[index], target, ds, result)) {
            return true;
        }

        ds.remove(ds.size() - 1);
        if (targetSumFirst(arr, index + 1, sum, target, ds, result)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
//        int result = targetSum(new int[]{1, 2, 3, 4}, 0, 0, 4, new ArrayList<>());
//        System.out.println(result);

//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        int count = targetSum(new int[]{1, 2, 3, 4}, 0, 0, 4, new ArrayList<>(), result);
//        for(ArrayList<Integer> temp: result){
//            System.out.println(temp.toString());
//        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        targetSumFirst(new int[]{1, 2, 1}, 0, 0, 2, new ArrayList<>(), result);
        for (ArrayList<Integer> temp : result) {
            System.out.println(temp.toString());
        }
    }
}
