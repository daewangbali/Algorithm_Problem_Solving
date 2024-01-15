class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        for(long i= x ; x < 0 ? i>((long)x*n)+x: i<((long)x*n)+x ; i+=(long)x){
            answer[idx++] = i;
        }
        return answer;
    }
}