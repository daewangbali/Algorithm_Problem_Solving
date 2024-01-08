class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int n = numLog[0];
        char c = ' ';
        for(int i = 1 ; i < numLog.length ; i++){
            if(n + 1 == numLog[i]){
                c = 'w';
                n += 1;
            }else if(n - 1 == numLog[i]) {
                c = 's';
                n -= 1;
            }else if(n + 10 == numLog[i]) {
                c = 'd';
                n += 10;
            }else{
                c = 'a';
                n -= 10;
            }
            
            sb.append(c);
        }
        return sb.toString();
    }
}