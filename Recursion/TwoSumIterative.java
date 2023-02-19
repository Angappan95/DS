import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIterative {
    public static int[] findTargetSumWays(int[] nums, int target) {
        // Create an Hashmap dict
        // Iterate over each index in nums arr
        // check if (target - nums[index]) is present in the dict
        // if yes return index, value of dict[target - nums[index]
        // else create an entry with num along with its index

        HashMap<Integer, Integer> dict = new HashMap();
        for (int index = 0; index < nums.length; index++) {
            if (dict.containsKey(target - nums[index])) {
                return new int[]{dict.get(target - nums[index]), index};
            } else {
                dict.put(nums[index], index);
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {3, 11, 2, 4, 6, 1};
        int target = 7;
        System.out.println(Arrays.toString(findTargetSumWays(arr, target)));

    }
}
