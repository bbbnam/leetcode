class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int t = i + 1; t < nums.length; t++) {
                if (nums[i] == target - nums[t]) {
                    return new int[] {i, t};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}