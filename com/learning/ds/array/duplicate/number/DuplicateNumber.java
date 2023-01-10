package com.learning.ds.array.duplicate.number;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem statement 
 * https://leetcode.com/problems/contains-duplicate/submissions/862765806/ 
 */

class DuplicateNumber {
	
    public boolean containsDuplicate(int[] nums) {
    	/*
    	 * by default parameter, is duplicate exist is set to false to state there will not be any duplicates.
    	 */
        boolean status = false;
        Set<Integer> uniqueNumSet = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++) {
            if(uniqueNumSet.contains(nums[i])) {
                status = true; // duplicate found
                break;
            } else {
                uniqueNumSet.add(nums[i]);
            }
        }
        return status;
    }
    
    public static void main(String[] args) {
		
	}
}