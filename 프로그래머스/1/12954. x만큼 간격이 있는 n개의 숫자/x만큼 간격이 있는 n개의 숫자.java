class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long end = x == 0 ? n : (long) x * n;
        int idx = 0;
        for(long i = x ; x > 0 ? i <= end : i >= end ; i += x ){
            answer[idx++] = i;
        }
        return answer;
    }
}