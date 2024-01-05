import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length+1);
        
        int num1 = num_list[num_list.length-1];
        int num2 = num_list[num_list.length-2];
        if(num1 > num2){
            answer[answer.length-1] = num1 - num2;
        }else{
            answer[answer.length-1] = num1 * 2;
        }
        
        return answer;
        
    }
}