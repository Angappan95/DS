package com.learning.ds.array.subsequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int seq = 1, maxSeq = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                seq = seq + 1;
            } else {
                seq = 1;
            }
            maxSeq = Math.max(seq, maxSeq);
        }
        return maxSeq;
    }

    public static int longestConsecutiveHashSet(int[] nums) {
        /*
        Create an empty hash.
        Insert all array elements to hash.
        Do the following for every element arr[i]
        Check if this element is the starting point of a subsequence. To check this, simply look for arr[i] – 1 in the hash, if not found, then this is the first element of a subsequence.
        If this element is the first element, then count the number of elements in the consecutive starting with this element. Iterate from arr[i] + 1 till the last element that can be found.
        If the count is more than the previous longest subsequence found, then update this.
         */
        Set<Integer> set = new HashSet<>();
        int result = 1;
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int current = nums[i];
                int currentSeqCount = 1;
                while (set.contains(current + 1)) {
                    current++;
                    currentSeqCount++;
                }
                result = Math.max(result, currentSeqCount);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
//        System.out.println(longestConsecutive(new int[] {1, 2, 4, 199, 200, 201, 204, 205, 206, 207}));
//        System.out.println(longestConsecutive(new int[]{1, 2, 0, 1}));
        System.out.println(longestConsecutiveHashSet(new int[]{1, 2, 0, 1}));
        System.out.println(longestConsecutiveHashSet(new int[]{100, 4, 200, 1, 3, 2}));


    }
}
