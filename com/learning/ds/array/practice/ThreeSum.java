package com.learning.ds.array.practice;

import java.util.*;

public class ThreeSum {
    public static List<int[]> findThreeSum(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        result.add(new int[]{arr[i], arr[j], arr[k]});
                    }
                }
            }
        }
        return result;
    }

    public static List<int[]> findThreeSumPointer(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == target) {
                    result.add(new int[]{arr[i], arr[left], arr[right]});
                    left++;
                    right--;
                    while (left > 0 && arr[left] == arr[left - 1]) { //To skip duplicates in j-th position.
                        left++;
                    }
                    while (right < arr.length && arr[right] == arr[right + 1]) { //To skip duplicates in k-th position.
                        right--;
                    }
                } else if (arr[i] + arr[left] + arr[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    public static List<int[]> findThreePointerHash(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int left = 0; left < arr.length - 1; left++) {
            int right = arr.length - 1;
            while (left < right) {
                int missingNum = target - (arr[left] + arr[right]);
                if (map.containsKey(missingNum)) {
                    result.add(new int[]{missingNum, arr[left], arr[right]});
                    left++;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<int[]> result;
//        result = findThreeSum(new int[]{-1, 0, 1, 2, -1, 4, -2, -3}, 3);
//        result = findThreeSumPointer(new int[]{1,1,2,3,0}, 3);
//        result = findThreePointerHash(new int[]{2, 0, -2, -2, 4, 1, 3}, 4);
        result = findThreeSum(new int[]{-1, 0, 1, 2, -1, -4}, 0);
        for (int[] item : result) {
            System.out.println(Arrays.toString(item));
        }
    }
}
