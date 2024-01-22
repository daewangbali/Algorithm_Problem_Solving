class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1 ; i <= Math.sqrt(yellow) ; i++){
            if((yellow / i) != 0){
                int w = yellow / i;
                int h = i;
                if(w * h == yellow && ( w + 2 ) * ( h + 2 ) == (brown + yellow)){
                    //return new int[] {w + 2 , h + 2};
                    answer[0] = w + 2;
                    answer[1] = h + 2;
                    break;
                }
            }
        }
        
        return answer;
    }
}