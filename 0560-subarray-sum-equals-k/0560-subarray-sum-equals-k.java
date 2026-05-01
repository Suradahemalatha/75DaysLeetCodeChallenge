import java.util.HashMap;
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            if (prefixCounts.containsKey(prefixSum - k)) {
                count += prefixCounts.get(prefixSum - k);
            }
            prefixCounts.put(prefixSum, prefixCounts.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}