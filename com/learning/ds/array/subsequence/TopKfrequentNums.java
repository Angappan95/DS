package com.learning.ds.array.subsequence;

import java.util.*;
import java.util.stream.IntStream;

public class TopKfrequentNums {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else map.put(num, 1);
        }
        // sort the map baseed on the occurance count
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        // Sort the list
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (Objects.equals(o1.getValue(), o2.getValue()))
                    return o2.getKey() - o1.getKey();
                else
                    return o2.getValue() - o1.getValue();
            }
        });
        for(int i=0; i<k; i++){
            result.add(list.get(i).getKey());
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3,3,3,3}, 2)));
    }
}
