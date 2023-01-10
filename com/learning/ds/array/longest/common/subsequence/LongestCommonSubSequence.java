package com.learning.ds.array.longest.common.subsequence;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubSequence {
	
	public Integer lengthOfLongestSubstring(String s) {

        Integer length=0;
        char[] ch = s.toCharArray();
        if (ch.length==1) {
        	length = 1;
        } else {
        	List<Character> temporaryList = new ArrayList<Character>();
        	boolean isEndOfStringReached = false;
        	for(int i=0;i<ch.length-1;i++) {
        		temporaryList.clear();
        		temporaryList.add(ch[i]);
                for (int j=i+1; j<s.length();j++) {
                    if (temporaryList.contains(ch[j])) {
                        length = (length<temporaryList.size())?temporaryList.size():length;
                        break;
                    } else{
                        temporaryList.add(ch[j]);
                    }
                    if(j+1 == ch.length) {
                    	isEndOfStringReached=true;
                    }
                }
                if(isEndOfStringReached) {
                	break;
                }
            }
            length = (length<temporaryList.size())?temporaryList.size():length;
        }
        
        return length;
    }
	
	public static void main(String[] args) {
		String s="dvdf";
		LongestCommonSubSequence seq = new LongestCommonSubSequence();
		System.out.println(seq.lengthOfLongestSubstring(s));
		
	}

}
