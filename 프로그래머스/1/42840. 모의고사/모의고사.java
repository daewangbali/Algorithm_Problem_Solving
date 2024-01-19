import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];
        
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == p1[i - ((i / p1.length) * p1.length)]) 
                correct[0]++;
            if(answers[i] == p2[i - ((i / p2.length) * p2.length)]) 
                correct[1]++;
            if(answers[i] == p3[i - ((i / p3.length) * p3.length)]) 
                correct[2]++;
        }
        
        int max = Math.max(Math.max(correct[0], correct[1]), correct[2]);
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<correct.length ; i++){
            if(correct[i] == max)
                list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}