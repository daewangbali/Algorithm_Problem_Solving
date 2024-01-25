import java.util.*;
class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n)).reverse();
        int[] answer = new int[sb.length()];
        String[] sarr = sb.toString().split("");
        
        for(int i=0 ; i<sarr.length ; i++){
            answer[i] = Integer.parseInt(sarr[i]);
        }
        return answer;
    }
}