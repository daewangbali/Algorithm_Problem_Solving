class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String s = "수박";
        answer.append(s.repeat(n / 2));
        if(n % 2 != 0) 
            answer.append("수");   
        return answer.toString();
    }
}