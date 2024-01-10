import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0 ; i<priorities.length ; i++){
            queue.offer(10 - priorities[i]);
        }
        
        while(!queue.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == 10-priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}