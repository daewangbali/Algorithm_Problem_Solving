class Solution {
    public int solution(int n) {
        int answer = n - 1;
        for(int i = 2 ; i <= Math.sqrt(answer) ; i++){
            if(answer % i == 0){
                answer = i;
                break;
            }
                
        }
        return answer;
    }
}