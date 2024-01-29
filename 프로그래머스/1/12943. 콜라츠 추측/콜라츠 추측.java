class Solution {
    public int solution(int num) {
        int answer = 0;
        long longnum = num;
        for(int i = 1 ; i <= 500 ; i++){
            if(longnum == 1) break;
            
            if(longnum % 2 == 0) longnum /= 2;
            else longnum = (longnum * 3 + 1);
            answer++;
            
            if(i == 500) answer = -1;
        }
        return answer;
    }
}