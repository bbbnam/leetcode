class Solution {
    public void reverseString(char[] s) {
         // solution #1
        //s = new StringBuffer(new String(s)).reverse().toString().toCharArray();

        // solution #2
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        int size = s.length / 2;
        for (int i = 0; i < size; i++) {
            char left = s[leftIndex];
            char right = s[rightIndex];
            s[leftIndex] = right;
            s[rightIndex] = left;
            leftIndex++;
            rightIndex--;
        }
    }
}