import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack();
        
        if(s.charAt(0) == ')') return false;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push(1);
            }else{
                if(stack.size() > 0)
                    stack.pop();
                else{
                    return false;
                }
            }
        }
        if(stack.size() > 0)
            answer = false;

        return answer;
    }
}