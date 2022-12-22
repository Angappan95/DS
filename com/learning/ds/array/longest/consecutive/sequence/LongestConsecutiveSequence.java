package com.learning.ds.array.longest.consecutive.sequence;

import java.util.Arrays;

public class LongestConsecutiveSequenceSorting {
	
	
	public int longestConsecutive(int[] nums) {
		int length = 0;
		Arrays.sort(nums);
		
		if(nums.length == 1) {
			length = 1;
		} else if(nums.length == 0) {
			length = 0;
		} else {
			int tempLength=1;
			for (int i=0;i<nums.length-1;i++) {
				if(nums[i] == nums[i+1]) {
					
				}
				else if(nums[i]+1 == nums[i+1]) {
					tempLength++;
				} else {
					length = tempLength>length?tempLength:length;
					tempLength=1;
				}
			}
			length = tempLength>length?tempLength:length;
		}
		
		return length;
	}
	
	
	public static void main(String[] args) {
		LongestConsecutiveSequenceSorting seq = new LongestConsecutiveSequenceSorting();
		int[] num = {9,1,4,7,3,-1,0,5,8,-1,6};
		System.out.println(seq.longestConsecutive(num));

	}


}
