class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int number : nums) {
            if (integers.size() > 0 && integers.contains(number)) {
                integers.remove((Integer)number);
                continue;
            }
            integers.add(number);
        }
        return integers.get(0);
    }
}