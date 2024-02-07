import java.util.*;
class Solution {
    public String solution(String s) {
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        
        StringBuilder answer = new StringBuilder(new String(sarr));
        answer.reverse();
        
        return answer.toString();
    }
}