class Solution {
    // 짝수 i/2 번째 개수와 같다.
    // 홀수 i/2 번째의 개수 + 1과 같다.
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        
        for(int i=1; i<=n; i++) {
            if (i%2 == 0) {
                //짝수 
                result[i] = result[i/2];
            } else {
                result[i] = result[i/2]+1;
            }
        }
        
        // for (int i = 0; i <= n; i++) {
        //     int temp = i;
        //     int cnt = 0;
        //     while(temp != 0) {
        //         int remain = temp%2;
        //         cnt = cnt + remain;
        //         temp = temp/2;
        //     }
        //     result[i] = cnt;
        // } 이건...시간이 너무 오래걸림 
        return result;
    }
}