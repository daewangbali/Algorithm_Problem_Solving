import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int[] narr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i : narr){
            if(i != arr[0])
                answer[idx++] = i;
        }
        
        return answer;
    }
}