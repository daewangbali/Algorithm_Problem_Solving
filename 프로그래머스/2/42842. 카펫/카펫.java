import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        
        for(int i=1 ; i<=Math.sqrt(yellow) ; i++){
            if((yellow / i) != 0){
                list.add(i);
            }
        }
        
        for(int i=0 ; i<list.size() ; i++){
            int w = yellow / list.get(i);
            int h = list.get(i);
            if(w * h == yellow && ( w + 2 ) * ( h + 2 ) == (brown + yellow)){
                return new int[] {w+2 , h+2};
            }
        }
        
        return answer;
    }
}