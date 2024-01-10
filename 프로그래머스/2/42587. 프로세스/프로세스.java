import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> q = new LinkedList<>();
        for(int i=0 ; i<priorities.length ; i++){
            q.add(10 - priorities[i]);
        }
        
        Collections.sort(q);
        
        while(q.size() > 0){

            for(int i=0 ; i<priorities.length ; i++){
                if(q.get(0) == 10-priorities[i]){
                    answer++;
                    q.remove(0);
                    
                    if(location == i) return answer;
                }
            }
        }
        
        return answer;
    }
}