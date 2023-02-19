package com.learning.ds.array.duplicate.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class RepeatingMissingNum {
    public static List<Integer> find_missing(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> note = new HashMap<>();
        int duplicate = 0;
        int tempSum = 0;
        for (int i : arr) {
            if (note.containsKey(i)) {
                note.put(i, note.get(i) + 1);
                duplicate = i;
            } else {
                note.put(i, 1);
            }
            tempSum += i;
        }
        int total = arr.size() * (arr.size() + 1) / 2;
        return Arrays.asList(duplicate, total - tempSum + duplicate);
    }

    public static List<Integer> find_missing1(List<Integer> arr) {
        int max = arr.size();
        int repeatingNum=arr.get(0), missingNum=-1;
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i: arr){
            if(map.get(i) == null){
                map.put(i, true);
            } else {
                System.out.println("Repeating number = " + i);
                repeatingNum = i;
            }
        }
        for (int i=1; i<= max; i++){
            if (map.get(i) == null){
                System.out.println("Missing number = "+ i);
                missingNum = i;
            }
        }
        return Arrays.asList(repeatingNum, missingNum);
    }

    public static List<Integer> find_missing2(List<Integer> arr) {
        int duplicateNum=arr.get(0), missingNum=-1;

        int[] temp = new int[arr.size()+1];
        Arrays.fill(temp, 0);

        for(int i=0; i<=arr.size(); i++){
            if(temp[arr.get(i)]==0){
                temp[arr.get(i)] = 1;
            } else {
                duplicateNum = arr.get(i);
            }
        }

        int total = arr.size() * (arr.size() +1)/2;
        int tempSum=0;
        for(int i=0; i<temp.length; i++){
            tempSum += temp[i];
        }

        missingNum = total - tempSum;

        return Arrays.asList(duplicateNum, missingNum);
    }

    public static void main(String[] args) {
        System.out.println(find_missing(Arrays.asList(1, 2, 3, 1, 4)));
        System.out.println(find_missing1(Arrays.asList(1, 2, 3, 1, 4)));
        System.out.println(find_missing2(Arrays.asList(1, 2, 3, 1, 4)));
    }
}
